package data.framework.helper;

import data.framework.dialect.DatabaseDialectShortName;
import data.framework.dialect.Dialect;
import data.framework.dialect.DialectFactory;

import java.util.HashMap ;
import java.util.Map ;

/**
 * Dialect工具类。
 * 
 * @author zhyuanyuan
 * 
 */
public abstract class DialectHelper
{
    private static Map<DatabaseDialectShortName,Dialect> MAPPERS = new HashMap<DatabaseDialectShortName,Dialect>() ;

    public static Dialect getDialect( DatabaseDialectShortName dialectShortName )
    {
        if( MAPPERS.containsKey( dialectShortName ) )
        {
            return MAPPERS.get( dialectShortName ) ;
        }
        else
        {
            Dialect dialect = DialectFactory.buildDialect(dialectShortName) ;
            MAPPERS.put( dialectShortName, dialect ) ;
            return dialect ;
        }
    }
}