package com.sena.servicesecurity.DTO;

import java.util.List;

public interface IModuleDto extends IGenericDto{


    String getModule();
    String getDescription();
    String getRoute();
    Long getId();
    Boolean getState();
    List<IViewDto> getViews();
    void setViews(List<IViewDto> views);
}
