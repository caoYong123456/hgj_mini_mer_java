package com.ej.hgj.dao.cst;

import com.ej.hgj.entity.cst.HgjCst;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HgjCstDaoMapper {

    HgjCst getByCstCode(String cstCode);

    void delete();

    List<HgjCst> getList(HgjCst hgjCst);

}
