import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
        System.out.println("Array original: " + Arrays.toString(arr));
        RadixSort rs = new RadixSort();
        rs.radixSort(arr);
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

    public static class RadixSort {

        public void radixSort(int[] arr) {
            // Encontra o valor máximo para determinar o número de dígitos
            int max = Arrays.stream(arr).max().getAsInt();

            // Executa o radix sort para cada dígito
            for (int exp = 1; max / exp > 0; exp *= 10) {
                radixSortByDigit(arr, exp);
            }
        }

        private void radixSortByDigit(int[] arr, int exp) {
            int n = arr.length;
            int[] output = new int[n];
            int[] count = new int[10];

            // Inicializa o array de contagem
            Arrays.fill(count, 0);

            // Armazena a contagem de ocorrências em count[]
            for (int i = 0; i < n; i++) {
                count[(arr[i] / exp) % 10]++;
            }

            // Atualiza count[i] para que contenha a posição atual deste dígito em output[]
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Constrói o array de saída
            for (int i = n - 1; i >= 0; i--) {
                output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                count[(arr[i] / exp) % 10]--;
            }

            // Copia o array de saída para arr[], de forma que arr[] contenha os números
            // ordenados de acordo com o dígito atual
            System.arraycopy(output, 0, arr, 0, n);
        }
    }
}
