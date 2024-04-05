package com.sena.servicesecurity.DTO;

import java.util.List;
public interface IUserDto extends IGenericDto {
	 Long getId();
	    String getUsername();
	    String getPersonName();
	    String getPersonEmail();
	    Long getRoleId(); // Método para obtener el ID del rol
	    List<IViewDto> getViews(); // Método para obtener las vistas asociadas al rol
	    void setViews(List<IViewDto> views);
}
