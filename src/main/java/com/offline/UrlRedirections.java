package com.offline;

public class UrlRedirections {

	private String oldurl;
	private String newurl;
	
	public String getOldurl() {
        return oldurl;
    }
    public void setOldurl(String oldurl) {
        this.oldurl = oldurl;
    }
    public String getNewurl() {
        return newurl;
    }
    public void setNewurl(String newurl) {
        this.newurl = newurl;
    }
    
    @Override
    public String toString() {
        return "UrlRedirections:: oldUrl="+this.oldurl+" newUrl=" + this.newurl;
    }
}
