// autogenerated from SchemaBinder

package org.jbrain.xml.binding;

import org.dom4j.*;
import java.text.*;
import java.util.*;

public class _TypeConverter implements java.io.Serializable {
    private static ThreadLocal tlDate =
    	new ThreadLocal() {
    		protected Object initialValue() {
    			return new SimpleDateFormat("yyyy'-'MM'-'dd");
    		}
    	};
    
    private static ThreadLocal tlGMTTime =
    	new ThreadLocal() {
    		protected Object initialValue() {
    			SimpleDateFormat ztf = new SimpleDateFormat("HH:mm:ss zzz");
    			TimeZone zTimeZone = TimeZone.getTimeZone("GMT");
    			ztf.setTimeZone(zTimeZone);
    			return ztf;
    		}
    	};
    
    private static ThreadLocal tlLocalTime =
    	new ThreadLocal() {
    		protected Object initialValue() {
    			return new SimpleDateFormat("HH:mm:ss");
    		}
    	};
    
    private static ThreadLocal tlMonthDay =
    	new ThreadLocal() {
    		protected Object initialValue() {
    			return new SimpleDateFormat("MM-dd");
    		}
    	};
    
    public static Date parseDate(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
            return ((SimpleDateFormat) tlDate.get()).parse(s.trim());
        } catch (Exception e) { 
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);
        }
    }

    public static String buildDate(Date o) {
        if(o == null)
            return null;
        return ((SimpleDateFormat) tlDate.get()).format(o);
    }

    public static Boolean parseBoolean(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
            return new Boolean(s);
        } catch (Exception e) {
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
        }
    }

    public static String buildBoolean(Boolean o) {
        if (o == null)
            return null;
        return null;
    }

    public static Double parseDouble(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
            return new Double(s);
        } catch (Exception e) {
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
        }
    }

    public static String buildDouble(Double o) {
        if (o == null)
            return null;
        return o.toString();
    }

    public static Integer parseInteger(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
            return new Integer(s);
        } catch (Exception e) {
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
        }
    }

    public static String buildInteger(Integer o) {
        if (o == null)
            return null;
        return o.toString();
    }
    
    public static Date parseTime(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
        	s = s.trim();
        	int i = s.length();
        	if (s.substring(i - 1).toUpperCase().equals("Z")) {
        		s = s.substring(0, i - 1).trim() + " GMT";
        	} else if (i > 12) {
        		// handle anything of form HH:MM:SS-00:00
        		s = s.substring(0, 7) + " GMT" + s.substring(8).trim();
        		return ((SimpleDateFormat) tlGMTTime.get()).parse(s);
        	} else if (i > 8) {
        		// we have a HH:MM:SS-00, add :00 to it
        		s = s.substring(0, 7) + " GMT" + s.substring(8).trim() + ":00";
        		return ((SimpleDateFormat) tlGMTTime.get()).parse(s);
        	} else if (i > 7) {
        		// assume my local time zone
        		return ((SimpleDateFormat) tlLocalTime.get()).parse(s);
        	}
        }
        catch (Exception e) {}
        // if we get here, throw exception
		throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
    }

    public static String buildTime(Date o) {
        if (o == null)
            return null;
        return ((SimpleDateFormat) tlGMTTime.get()).format(o).substring(0, 8) + "+00:00";
    }
    public static Date parseMonthDay(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
            return null;
        } catch (Exception e) {
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
        }
    }

    public static String buildMonthDay(Date o) {
        if (o == null)
            return null;
        return ((SimpleDateFormat) tlMonthDay.get()).format(o);
    }
    
    public static Date parseYear(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
            return ((SimpleDateFormat) tlMonthDay.get()).parse(s.trim());
        } catch (Exception e) {
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
        }
    }

    public static String buildYear(Date o) {
        if (o != null)
		throw new UnsupportedOperationException("Year datatype not yet supported");
        return null;
    }
    
    public static Date parseYearMonth(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
            throw new UnsupportedOperationException("YearMonth datatype not yet supported");
        } catch (Exception e) {
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
        }
    }

    public static String buildYearMonth(Date o) {
        if (o != null)
			throw new UnsupportedOperationException("YearMonth datatype not yet supported");
        return null;
    }
    
    public static Date parseMonth(String s, String object, String field) {
		if (s == null || s.trim().equals("")) {
			throw new NullPointerException(object + "." + field + " is required");
		}

        try {
			throw new UnsupportedOperationException("Month datatype not yet supported");
        } catch (Exception e) {
			throw new IllegalArgumentException(object + "." + field + " contains invalid data: " + s);        
        }
    }

    public static String buildMonth(Date o) {
        if (o != null)
			throw new UnsupportedOperationException("Month datatype not yet supported");
        return null;
    }
}
