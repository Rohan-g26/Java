public class AminoacidMolWt 
{
    public static void main(String[] args) 
   {

        String[] amino_acids = {"alanine", "aspartic acid", "cysteine", "glutamic acid", "phenylalanine",
                "glycine", "histidine", "isoleucine", "lysine", "leucine",
                "methionine", "asparagine", "arginine", "serine", "glutamine", 
                "threonine", "valine", "tryptophan", "tyrosine", "proline"};

        double[] mw = {89.1, 133.1, 121.2, 147.1, 165.2, 75.1, 155.2, 131.2, 146.2, 131.2,
                       149.2, 132.1, 174.2, 105.1, 146.2, 119.1, 117.1, 204.2, 181.2, 115.1};

        System.out.println("The amino acids and their corresponding molecular weights are: \n");

        int i;
        for(i = 0; i < amino_acids.length; i++)
        {
            System.out.println(amino_acids[i] + " = " + mw[i] + " g/mol");
        }
    }
}