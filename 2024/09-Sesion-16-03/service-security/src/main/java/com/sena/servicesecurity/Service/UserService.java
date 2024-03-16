package com.sena.servicesecurity.Service;

import com.sena.servicesecurity.DTO.IUserDto;
import com.sena.servicesecurity.DTO.IViewDto;
import com.sena.servicesecurity.Entity.User;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IUserRepository;
import com.sena.servicesecurity.Service.IService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService extends ABaseService<User> implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    protected IBaseRepository<User, Long> getRepository() {
        return userRepository;
    }



    @Override
    public Optional<IUserDto> getUserWithViews(String username, String password) {
    	
        List<IUserDto> userDtoList = userRepository.getUserWithRole(username, password);

        if (!userDtoList.isEmpty()) {
            IUserDto userDto = userDtoList.get(0);
            
            Long roleId = userDto.getRoleId();
            
            System.out.println(userDto);
            
            List<IViewDto> views = userRepository.getViewsByRoleId(roleId);
            
            System.out.println(roleId);
            // Crear una implementación concreta de IUserDto y llenarla con los datos obtenidos
           
            IUserDto dto = new IUserDto() {
                @Override
                public Long getId() {
                    return userDto.getId();
                }

                @Override
                public String getUsername() {
                    return userDto.getUsername();
                }

                @Override
                public String getPersonName() {
                    return userDto.getPersonName();
                }

                @Override
                public String getPersonEmail() {
                    return userDto.getPersonEmail();
                }

                @Override
                public Boolean getState() {
                    return userDto.getState();
                }

                @Override
                public Long getRoleId() {
                    return userDto.getRoleId();
                }

                @Override
                public List<IViewDto> getViews() {
                    return views;
                }

				@Override
				public void setViews(List<IViewDto> views) {
					// TODO Auto-generated method stub
					
				}

                
            };

            return Optional.of(dto);
        } else {
            return Optional.empty();
        }
    }



    
    
    
   

    
}
