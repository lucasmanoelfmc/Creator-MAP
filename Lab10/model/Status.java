package Lab10.model;

public enum Status {

    DISPONIVEL("\u001B[32mDisponivel\u001B[0m"),
    RESERVADO("\u001B[33mReservado\u001B[0m"),
    INDISPONIVEL("\u001B[31mIndisponivel\u001B[0m");

    private final String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

}
