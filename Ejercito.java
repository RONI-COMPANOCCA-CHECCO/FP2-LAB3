class Ejercito {
    private Soldados[] soldado;

    public Ejercito(int numeroSoldados) {
        soldado = new Soldados[numeroSoldados];
        for (int i = 0; i < numeroSoldados; i++) {
            soldado[i] = new Soldados("Soldado" + i);
        }
    }

    public Soldados[] getSoldados() {
        return soldado;
    }

    public int getNumeroDeSoldados() {
        return soldado.length;
    }
}