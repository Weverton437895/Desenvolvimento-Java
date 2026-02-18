package modelo;

public interface IAutenticavel {
    boolean login(String usuario, String senha);
    void logout();
}