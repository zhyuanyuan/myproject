package data.framework.support.data;


import data.framework.support.security.PrincipalDetails;

public class DataAuthorityThreadLocal
{
    private static final ThreadLocal<PrincipalDetails> currentThreadVariables = new ThreadLocal<PrincipalDetails>() ;
    
    /**
     * 获取线程变量中的当前登录用户session信息。
     * @return 当前登录用户session信息
     */
    public static PrincipalDetails getCurrentThreadVariables()
    {
        return currentThreadVariables.get() ;
    }
    
    /**
     * 设置线程变量中的当前登录用户session信息。
     * @param userDetails 当前登录用户session信息
     */
    public static void setCurrentThreadVariables( PrincipalDetails userDetails )
    {
        currentThreadVariables.set( userDetails ) ;
    }
    
    public static void remove()
    {
        currentThreadVariables.remove() ;
    }
}