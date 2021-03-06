package com.ipn.mx.controlador.web;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author El TEAM AFR
 */
@Data
public class BaseBean implements Serializable {
    protected static final String ACC_CREAR = "CREAR";
    protected static final String ACC_ACTUALIZAR = "ACTUALIZAR";
    protected static final String ACC_LEER = "LEER";
    protected static final String ACC_VERIFICAR = "VERIFICAR";
    protected String accion;
    
    public boolean isModoCrear(){
        if(accion != null){
            return accion.equals(ACC_CREAR);
        }else{
            return false;
        }
    }
    
    public boolean isModoActualizar(){
        if(accion != null){
            return accion.equals(ACC_ACTUALIZAR);
        }else{
            return false;
        }
    }
    
    public boolean isModoVerificar(){
        if(accion != null){
            return accion.equals(ACC_VERIFICAR);
        }else{
            return false;
        }
    }
    
    public boolean isModoLeer(){
        if(accion != null){
            return accion.equals(ACC_LEER);
        }else{
            return false;
        }
    }
}
