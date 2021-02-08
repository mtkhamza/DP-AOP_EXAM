package ma.dp.aspects;

public class AppContext {
    private static String username="";
    private static String password="";
    private static String[] roles={};
    public static boolean authenticateUser(String u,String p,String[] inputRoles){
        if((u.equals("root"))&&(p.equals("1234")) ){
            username= u;password=p;
            roles=inputRoles;
            return true;
        }
        return false;
    }

    public static boolean hasRole(String role){
        for (String r:roles) {
            if(r.equals(role))return true;
        }
        return false;
    }
}
