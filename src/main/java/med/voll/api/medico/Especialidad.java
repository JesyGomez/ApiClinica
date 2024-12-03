package med.voll.api.medico;

public enum Especialidad {
    ORTOPEDIA("ortopedia"),
    CARDIOLOGIA("cardiologia"),
    GINECOLOGIA("ginecologia"),
    PEDIATRIA("pediatria");

    private final String valor;

    // Constructor para asociar el valor al enum
    Especialidad(String valor) {
        this.valor = valor;
    }

    // Método para obtener el valor asociado
    public String getValor() {
        return valor;
    }
}
