package logicBd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class LoginResult {
    
     private boolean success;
    private Long userId;

    public LoginResult(boolean success, Long userId) {
        this.success = success;
        this.userId = userId;
    }

    public boolean isSuccess() {
        return success;
    }

    public Long getUserId() {
        return userId;
    }
}
