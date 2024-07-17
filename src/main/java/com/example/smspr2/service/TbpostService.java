package com.example.smspr2.service;

import com.example.smspr2.domain.Tbpost;
import com.example.smspr2.dto.TbpostDto;
import com.example.smspr2.repository.TbpostRepository;
import com.example.smspr2.service.impl.TbpostServiceimpl;
import org.springframework.stereotype.Service;

@Service
public class TbpostService implements TbpostServiceimpl {

    private TbpostRepository tbpostRepository;
    public TbpostService(TbpostRepository tbpostRepository) {
        this.tbpostRepository = tbpostRepository;
    }

    public TbpostDto.CreareResDto create(TbpostDto.CreareResDto param){
        //1번
        /*Tbpost tbost = new Tbpost();
        tbpost.setTitle(param.getTitle());

        tbpostRepository.save(tbost);

        TbpostDto.CreareResDto */
                //2번
        Tbpost tbpost = tbpostRepository.save(param.toEntity());

        //1번 리턴 방법

        //2번 리턴방법

        //1 return new TbpostDto.CreareResDto();
        //2 return tbpost.toCreateResDto();
        //3 rceturn tbpostRepository.save(param.toEntity()).toCreateResDto();
    }

    //update

    //detail
}
