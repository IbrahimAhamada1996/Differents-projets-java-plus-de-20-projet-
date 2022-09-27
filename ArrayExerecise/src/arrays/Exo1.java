package arrays;

public class Exo1 {
    private String name;

    public static void main(String[] args) {
        int[] entiers  = new int[]{1,2,3,4,5,6,7,8,9,8,5,6,5,66,6,9};
        int somme=0;
        for (int entier:entiers
             ) {
            somme+=entier;
        }

        double average = somme/entiers.length;

        System.out.println("average = " + average);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exo1 exo1 = (Exo1) o;

        return name != null ? name.equals(exo1.name) : exo1.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
