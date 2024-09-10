public class Main{
    public static void main(String[] args){
        int[] arr_cred = {20, 6, 6, 12, 10, 25};
        int[] arr_calif = {6, 8, 9, 8, 7, 7};
        float prom = calcular_promedio(arr_cred, arr_calif) / suma_creditos(arr_cred);
        System.out.printf("Promedio ponderado: %.2f", prom);
    }
    public static float calcular_promedio(int[] arr1, int[] arr2){
        float suma = 0;
        for (int i = 0; i < arr1.length; i++){
            suma += arr1[i] * arr2[i];
        }
        return suma;
    }
    public static int suma_creditos(int[] arr){
        int suma = 0;
        for (int cred : arr)
            suma += cred;
        return suma;      
    }
}
