package model.�ݏo;

import java.util.*;

import static model.�ݏo.�ݏo�C�x���g�^�C�v.*;
import static model.�ݏo.�ݏo�X�e�[�^�X�^�C�v.*;


public class ��ԑJ�� {

    // from to �Ƃ����l����
    Map<�ݏo�X�e�[�^�X�^�C�v, Set<�ݏo�X�e�[�^�X�^�C�v>> fromTo = new HashMap<>();

    {
        fromTo.put(�ݏo�\, EnumSet.of(�ݏo��, �s���s��) );
        fromTo.put(�ݏo��, EnumSet.of(�ԋp�������ߕt�������̒ʒm�ς�, �ݏo�\) );
        fromTo.put(�ԋp�������ߕt�������̒ʒm�ς�, EnumSet.of(���ؒ�, �ݏo�\) );
        fromTo.put(���ؒ�, EnumSet.of(�ݏo�\, �ݏo��) );
        fromTo.put(�s���s��, EnumSet.of(�ݏo�\, �ݏo��) );
    }

    // from �� �\�ȃC�x���g
    Map<�ݏo�C�x���g�^�C�v, Set<�ݏo�X�e�[�^�X�^�C�v>> from = new HashMap<>();

    {
        from.put(�\��, EnumSet.of(�ݏo��,�ԋp�������ߕt�������̒ʒm�ς�,���ؒ�));
        from.put(�ݏo, EnumSet.of(�ݏo�\));
        from.put(�ݏo�̎��s, EnumSet.of(�ݏo�\));
        from.put(�ԋp�������ߕt�������̒ʒm, EnumSet.of(�ݏo��));
        from.put(�����؂�, EnumSet.of(�ԋp�������ߕt�������̒ʒm�ς�));
        from.put(����, EnumSet.of(�ԋp�������ߕt�������̒ʒm�ς�,�ݏo��, ���ؒ�));
        from.put(�ԋp, EnumSet.of(�ԋp�������ߕt�������̒ʒm�ς�,�ݏo��, ���ؒ�));
        from.put(�I��, EnumSet.allOf(�ݏo�X�e�[�^�X�^�C�v.class));
    }

    public Set<�ݏo�X�e�[�^�X�^�C�v> validStatus(�ݏo�C�x���g�^�C�v �ݏo�C�x���g�^�C�v){
        return  from.get(�ݏo�C�x���g�^�C�v);
    }

    public void ensureStatus(�ݏo�C�x���g�^�C�v �ݏo�C�x���g�^�C�v, �ݏo�X�e�[�^�X�^�C�v �ݏo�X�e�[�^�X�^�C�v) {

        Set<�ݏo�X�e�[�^�X�^�C�v> validStatus = validStatus(�ݏo�C�x���g�^�C�v);

        if(validStatus.contains(�ݏo�X�e�[�^�X�^�C�v)) return;

        throw new IllegalStateException("�\��ł��Ȃ����");
    }
}
