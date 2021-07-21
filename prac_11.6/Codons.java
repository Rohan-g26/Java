package CodonPack; 

// compile the package first 
// command line version 

class Codons
{

static void PrintCodons(String in)

{ 
switch(in)

{ 
case "alanine": 

System.out.println('\n' + "The codons are: GCT, GCC, GCA, GCG"); 

break; 

case "cysteine": 

System.out.println('\n' + "The codons are: TGT, TGC"); 

break; 

case "aspartic_acid": 

System.out.println('\n' + "The codons are: GAT, GAC"); 

break; 

case "glutamic_acid": 

System.out.println('\n' + "The codons are: GAA, GAG"); 

break; 

case "phenylalanine": 

System.out.println('\n' + "The codons are: TTC, TTT"); 

break; 

case "glycine": 

System.out.println('\n' + "The codons are: GGG, GGC, GGT, GGA"); 

break; 

case "histidine": 

System.out.println('\n' + "The codons are: CAT, CAC"); 

break; 

case "isoleucine": 

System.out.println('\n' + "The codons are: ATT, ATC, ATA"); 

break; 

case "lysine": 

System.out.println('\n' + "The codons are: AAA, AAG"); 

break; 

case "leucine": 

System.out.println('\n' + "The codons are: CTT, CTC, CTA, CTG, TTA, TTG"); 

break; 

case "methionine": 

case "proline": 

System.out.println('\n' + "The codons are: CCC, CCT, CCA, CCG"); 

break; 

System.out.println('\n' + "The codon is: ATG"); 

break; 

case "asparagine": 

System.out.println('\n' + "The codons are: AAC, AAT"); 

break; 

case "glutamine": 

System.out.println('\n' + "The codons are: CAG, CAA"); 

break; 

case "arginine": 

System.out.println('\n' + "The codons are: CGG, AGA, AGG, CGT, CGC, CGA"); 

break; 

case "serine": 

System.out.println('\n' + "The codons are: TCG, AGC, AGT, TCT, TCC, TCA"); 

break; 

case "threonine": 

System.out.println('\n' + "The codons are: ACT|ACC|ACA|ACG"); 

break; 

case "valine": 

System.out.println('\n' + "The codons are: GTT, GTG, GTA, GTC"); 

break; 

case "tryptophan": 

System.out.println('\n' + "The codon is: TGG"); 

break; 

case "tyrosine": 

System.out.println('\n' + "The codons are: TAT, TAC"); 

break; 



case "all": 

System.out.println('\n' + "Alanine: GCT, GCC, GCA, GCG"); 

System.out.println("Arginine: CGT, CGC, CGA, CGG, AGA, AGG"); 

System.out.println("Asparagine: AAT, AAC"); 

System.out.println("Aspartic acid: GAT, GAC"); 

System.out.println("Cystine: TGT, TGC"); 

System.out.println("Glutamic acid: GAA, GAG"); 

System.out.println("Glutamine: CAA, CAG"); 

System.out.println("Glycine: GGT, GGC, GGA, GGG"); 

System.out.println("Histidine: CAT, CAC"); 

System.out.println("Iso-leucine: ATT, ATC, ATA"); 

System.out.println("Leucine: CTT, CTC, CTA, CTG, TTA, TTG"); 

System.out.println("Lysine: AAA, AAG"); 

System.out.println("Methionine: ATG"); 

System.out.println("Phenylalanine: TTC, TTT"); 

System.out.println("Proline: CCT, CCC, CCA, CCG"); 

System.out.println("Serine: TCT, TCC, TCA, TCG, AGT, AGC"); 

System.out.println("Threonine: ACT, ACC, ACA, ACG"); 

System.out.println("Tryptophan: TGG"); 

System.out.println("Tyrosine: TAT, TAC"); 

System.out.println("Valine: GTT GTC, GTA, GTG"); 

break; 

 

default: 

System.out.println("Invalid input!! \n Enter all to display codons for all amino acids. (NB: for joint words, write as aspartic_acid, glutamic_acid)"); 

break; 

} 

 

} 

 

public static void main(String[] args) 

{ 
args[0] = args[0].toLowerCase(); 

PrintCodons(args[0]); 
} 

} 

 