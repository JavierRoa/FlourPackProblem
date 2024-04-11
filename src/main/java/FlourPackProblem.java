public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(4, 18, 19));
    }
    private static boolean canPack(int bigCount, int smallCount, int goal) {
        // Validación parametros positivos.
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigSackCapacity = 5;  // Creo variable bigSackCapacity con valor 5 (Podría usar el 5 directamente en los cálculos, pero con esta variable es más fácil comprender la razón del uso de ese número)
        int bigSacksUsed = Math.min(goal / bigSackCapacity, bigCount);  // Creo la variable bigBagsUsed, cuyo valor es la cantidad de bolsas de 5 kilos que deben usarse.
        return (bigSacksUsed * bigSackCapacity) + smallCount >= goal;  // Retorna true si se pueden empacar de forma exacta el goal con las bolsas grandes (5 kilos) y bolsas pequeñas (1 kilo).
    }
}
