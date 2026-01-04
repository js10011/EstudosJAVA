import java.security.SecureRandom;
 
class geradorSenha
{
    
    public static String generateRandomPassword(int len)
    {
        
        final String chars = "!@#$%&*></?ABCDEFGHIJKLM0123456789NOPQRSTUVWXYZ!@#$%&*></?abcdefghijklmnopqrs0123456789tuvwxyz0123456789!@#$%&*></?";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
 
    public static void main(String[] args)
    {
        int len = 20;
        System.out.println(generateRandomPassword(len));
    }
}

