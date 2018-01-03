package rental.model.貸出;

import java.util.*;

import static rental.model.貸出.貸出イベントタイプ.*;
import static rental.model.貸出.貸出ステータスタイプ.*;


public class 状態遷移 {

    // from to という考え方
    Map<貸出ステータスタイプ, Set<貸出ステータスタイプ>> fromTo = new HashMap<>();

    {
        fromTo.put(貸出可能, EnumSet.of(貸出中, 行方不明) );
        fromTo.put(貸出中, EnumSet.of(返却期限が近付いた時の通知済み, 貸出可能) );
        fromTo.put(返却期限が近付いた時の通知済み, EnumSet.of(延滞中, 貸出可能) );
        fromTo.put(延滞中, EnumSet.of(貸出可能, 貸出中) );
        fromTo.put(行方不明, EnumSet.of(貸出可能, 貸出中) );
    }

    // from と 可能なイベント
    Map<貸出イベントタイプ, Set<貸出ステータスタイプ>> from = new HashMap<>();

    {
        from.put(貸出, EnumSet.of(貸出可能));
        from.put(貸出の失敗, EnumSet.of(貸出可能));
        from.put(返却期限が近付いた時の通知, EnumSet.of(貸出中));
        from.put(期限切れ, EnumSet.of(返却期限が近付いた時の通知済み));
        from.put(延長, EnumSet.of(返却期限が近付いた時の通知済み,貸出中, 延滞中));
        from.put(返却, EnumSet.of(返却期限が近付いた時の通知済み,貸出中, 延滞中));
        from.put(棚卸, EnumSet.allOf(貸出ステータスタイプ.class));
    }

    public Set<貸出ステータスタイプ> validStatus(貸出イベントタイプ 貸出イベントタイプ){
        return  from.get(貸出イベントタイプ);
    }

    public void ensureStatus(貸出イベントタイプ 貸出イベントタイプ, 貸出ステータスタイプ 貸出ステータスタイプ) {

        Set<貸出ステータスタイプ> validStatus = validStatus(貸出イベントタイプ);

        if(validStatus.contains(貸出ステータスタイプ)) return;

        throw new IllegalStateException("貸出できない状態");
    }
}
