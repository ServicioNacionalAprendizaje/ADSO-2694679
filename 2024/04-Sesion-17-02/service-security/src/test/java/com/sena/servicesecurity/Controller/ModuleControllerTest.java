package com.sena.servicesecurity.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sena.servicesecurity.Controller.ModuleController;
import com.sena.servicesecurity.DTO.ApiResponseDto;
import com.sena.servicesecurity.DTO.IModuleDto;
import com.sena.servicesecurity.Entity.Module;
import com.sena.servicesecurity.IService.IModuleService;

class ModuleControllerTest {

    @InjectMocks
    private ModuleController moduleController;

    @Mock
    private IModuleService moduleService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindByStateTrue() throws Exception {
        // Mock data
        List<Module> moduleList = new ArrayList<>();
        Module module = new Module();
        moduleList.add(module);

        // Mock service method
        when(moduleService.findByStateTrue()).thenReturn(moduleList);

        // Call controller method
        ResponseEntity<ApiResponseDto<List<Module>>> responseEntity = moduleController.findByStateTrue();

        // Assertions
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Datos obtenidos", responseEntity.getBody().getMessage());
        assertEquals(moduleList, responseEntity.getBody().getData());
        assertEquals(true, responseEntity.getBody().getStatus());
    }

    @Test
    public void testShow() throws Exception {
        // Mock data
        Long moduleId = 1L;
        Module module = new Module();
        Optional<Module> optionalModule = Optional.of(module);

        // Mock service method
        when(moduleService.findById(moduleId)).thenReturn(optionalModule);

        // Call controller method
        ResponseEntity<ApiResponseDto<Optional<Module>>> responseEntity = moduleController.show(moduleId);

        // Assertions
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Registro encontrado", responseEntity.getBody().getMessage());
        assertEquals(optionalModule, responseEntity.getBody().getData());
        assertEquals(true, responseEntity.getBody().getStatus());
    }

    @Test
    public void testSave() throws Exception {
        // Mock data
        Module module = new Module();

        // Mock service method
        when(moduleService.save(module)).thenReturn(module);

        // Call controller method
        ResponseEntity<ApiResponseDto<Module>> responseEntity = moduleController.save(module);

        // Assertions
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Datos guardados", responseEntity.getBody().getMessage());
        assertEquals(module, responseEntity.getBody().getData());
        assertEquals(true, responseEntity.getBody().getStatus());
    }

    @Test
    public void testUpdate() throws Exception {
        // Mock data
        Long moduleId = 1L;
        Module module = new Module();

        // Call controller method
        ResponseEntity<ApiResponseDto<Module>> responseEntity = moduleController.update(moduleId, module);

        // Assertions
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Datos actualizados", responseEntity.getBody().getMessage());
        assertEquals(null, responseEntity.getBody().getData()); // No data expected in the response body for updates
        assertEquals(true, responseEntity.getBody().getStatus());
    }


    @Test
    public void testDelete() throws Exception {
        // Mock data
        Long moduleId = 1L;

        // Call controller method
        ResponseEntity<ApiResponseDto<Module>> responseEntity = moduleController.delete(moduleId);

        // Assertions
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Registro eliminado", responseEntity.getBody().getMessage());
        assertEquals(null, responseEntity.getBody().getData()); // No data expected in the response body for deletions
        assertEquals(true, responseEntity.getBody().getStatus());
    }
}