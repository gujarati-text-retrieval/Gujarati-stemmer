import java.io.*;
import java.util.*;


class Filter {

    public File[] finder( String dirName){
        File dir = new File(dirName);

        return dir.listFiles(new FilenameFilter() { 
                 public boolean accept(File dir, String filename)
                      { return filename.endsWith(".txt"); }
        } );

    }

}

class Handler implements Runnable{
	Thread t;
	public Handler(String name){
		t=new Thread(this,name);
		t.setDaemon(true);
		t.start();
	}
	public void run(){
		
	}
}


public class GujaratiStemmerVer1_1{
	public static void main(String[] args)throws IOException{
		Filter filter=new Filter();
		if(args.length==0)
			args = new String[] {"."};
		System.out.println(args.length);
		File []textFileList=filter.finder(args[0]);
		for(File file:textFileList){
			StringBuilder sb;
			File f = new File("new"+file.getName());
			try{
				BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF8"));
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f),"UTF8"));
				String str1; 
				boolean found;
				int len;
				while((str1=readFile.readLine())!=null){			
					StringTokenizer st = new StringTokenizer(str1," ");
					while(st.hasMoreTokens()){
						sb=new StringBuilder(st.nextToken());
						found=false;
						len=sb.length();
						if(len>5){
							if(sb.substring(len-5,len).equals("\u0AAE\u0ABE\u0A82\u0AA5\u0AC0")){  //maathi
								sb.replace(len-5,len," ");
								found=true;
							}
							else if(sb.substring(len-5,len).equals("\u0AB5\u0ABE\u0AB3\u0AC1\u0A82")){  //valu+ANUSVARA
								sb.replace(len-5,len," ");
								found=true;
							}
							else if(sb.substring(len-5,len).equals("\u0A85\u0A82\u0AA6\u0ABE\u0A9C")){  //andaj
								sb.replace(len-5,len," ");
								found=true;
							}
							else if(sb.substring(len-5,len).equals("\u0ABE\u0A82\u0ABF\u0A95\u0AA4")){  //ankit
								sb.replace(len-5,len," ");
								found=true;
							}
							else if(sb.substring(len-5,len).equals("\u0A96\u0ABE\u0AA4\u0AC1\u0A82")){  //khatu+ANUSVARA
								sb.replace(len-5,len," ");
								found=true;
							}
						}
						if((!found) && (len>4)){
							if(sb.substring(len-4,len).equals("\u0AB5\u0ABE\u0AB3\u0ACB")){  //valo
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0AA6\u0ABE\u0AA8\u0AC0")){  //dani
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0AB5\u0ABE\u0AB3\u0AC1")){  //valu
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0AB5\u0ABE\u0AB3\u0AC0")){  //vali
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0AB5\u0ABE\u0AB3\u0ABE")){  //vala
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0A97\u0AC0\u0AB0\u0AC0")){  //giri
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0AB6\u0ABE\u0AB3\u0AC0")){  //shali
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0AAA\u0AA3\u0AC1\u0A82")){  //pnu+ANUSVARA
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0A96\u0ABE\u0AA4\u0AC1")){  //khatu
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0A95\u0ABE\u0AB0\u0A95")){  //kark
								sb.replace(len-4,len," ");
								found=true;
							}
							else if(sb.substring(len-4,len).equals("\u0AA6\u0ABE\u0AAF\u0A95")){  //dayk
								sb.replace(len-4,len," ");
								found=true;
							}
							
							else if(sb.substring(len-2,len).equals("\u0AA8\u0ACB")){  //no
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0AC0")){  //ni
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0AC1")){  //nu
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0ABE")){  //naa
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0AC7")){  //ne
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0A95\u0ACB")){  //ko
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA4\u0ABE")){  //ta  
								sb.replace(len-2,len," ");
								found=true;
							}
						}
						if((!found) && (len>3)){
							if(sb.substring(len-3,len).equals("\u0AA8\u0AC1\u0A82")){  //nu+ANUSVARA
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0A93\u0AA8\u0ABE")){  //onaa
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0A93\u0AA8\u0AC7")){  //one
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AC0\u0AB2\u0ACB")){  //elo
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AAE\u0ABE\u0A82")){  //maa+ANUSVARA
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AB5\u0AC1\u0A82")){  //vu+ANUSVARA
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AAE\u0ABE\u0AA8")){  //maan
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AA8\u0ABE\u0AB0")){  //naar
								sb.replace(len-3,len,"\u0AB5\u0AC1\u0A82"+" ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0ABE\u0AB0\u0ACB")){  //aro
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0ABE\u0AAF\u0AA4")){  //aayt
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0A95\u0ABE\u0AB0")){  //kar
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AB5\u0ABE\u0AB0")){  //var
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AA6\u0ABE\u0AB0")){  //dar
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AB5\u0A9F\u0AC0")){  //vti
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AA1\u0AC1\u0A82")){  //du+ANUSVARA
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AA4\u0ACD\u0AB5")){  //tva
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AB5\u0ABE\u0AB2")){  //val
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0A97\u0AC0\u0AB0")){  //gir
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AA6\u0ABE\u0AA8")){  //dan
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AAC\u0ABE\u0A9C")){  //baj
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AB5\u0ABE\u0AA8")){  //van
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0ABE\u0AB3\u0AC1")){  //alu
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AB9\u0AC0\u0AA8")){  //hin
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0A95\u0AC3\u0AA4")){  //krut
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AAE\u0A82\u0AA4")){  //mnt
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AAE\u0AC1\u0A82")){  //mu+ANUSVARA
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AB5\u0A82\u0AA4")){  //vnt
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0ABE\u0AB5\u0AB0")){  //avr
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0A96\u0ACB\u0AB0")){  //khor
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0A97\u0ABE\u0AB0")){  //gar
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AAC\u0ABE\u0AA8")){  //ban
								sb.replace(len-3,len," ");
								found=true;
							}
							else if(sb.substring(len-3,len).equals("\u0AAE\u0A82\u0AA6")){  //mnd
								sb.replace(len-3,len," ");
								found=true;
							}
						}
						if((!found) && (len>2)){
							/*if(sb.substring(len-2,len).equals("\u0AA8\u0ACB")){  //no    moved into len>4
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0AC0")){  //ni
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0AC1")){  //nu
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0ABE")){  //naa
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA8\u0AC7")){  //ne
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0A95\u0ACB")){  //ko
								sb.replace(len-2,len," ");
								found=true;
							}
							else */if(sb.substring(len-2,len).equals("\u0AC0\u0A93")){  //eo    
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AAE\u0ABE")){  //maa
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AC0\u0AAF")){  //iy
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AA5\u0AC0")){  //thi
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AB3\u0AC1")){  //lu
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0A9C\u0AC0")){  //ji
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0ABE\u0A87")){  //aai
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0ABE\u0A88")){  //aaii
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0ABE\u0AA3")){  //aan
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0ABE\u0AB0")){  //aar
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0A95\u0AC0")){  //ki
								sb.replace(len-2,len," ");
								found=true;
							}/*
							else if(sb.substring(len-2,len).equals("\u0AA4\u0ABE")){  //ta   moved to len>4
								sb.replace(len-2,len," ");
								found=true;
							}*/
							else if(sb.substring(len-2,len).equals("\u0AB2\u0ACB")){  //lo
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\0A97\u0AC0")){  //gi
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0A9A\u0AC0")){  //chi
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AAA\u0AA3")){  //pn
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AB5\u0A9F")){  //vt
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0A97\u0AB0")){  //gr
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0ABE\u0AB3")){  //al
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AC0\u0AA8")){  //in
								sb.replace(len-2,len," ");
								found=true;
							}
							else if(sb.substring(len-2,len).equals("\u0AAF\u0ACB")){  //yo
								sb.replace(len-2,len," ");
								found=true;
							}
						}
						if((!found) && (len>1)){
							if(sb.substring(len-1,len).equals("\u0A93")){  //ao
								sb.replace(len-1,len," ");
								found=true;
							}
							else if(sb.substring(len-1,len).equals("\u0A8F")){  //ae
								sb.replace(len-1,len," ");
								found=true;
							}
							else if(sb.substring(len-1,len).equals("\u0ACB")){  //o
								sb.replace(len-1,len," ");
								found=true;
							}	
							/*else if(sb.substring(len-1,len).equals("\u0AC0")){  //e
								sb.replace(len-1,len," ");
								found=true;
							}
							else if(sb.substring(len-1,len).equals("\u0ABF")){  //ee
								sb.replace(len-1,len," ");
								found=true;
							}*/
							else if(sb.substring(len-1,len).equals("\u0AAE")){  //m
								sb.replace(len-1,len," ");
								found=true;
							}
						}
						out.write(sb.toString()+" ");
					}
					//out.write("\u0A8F");
				}
				out.close();
			}
			catch(UnsupportedEncodingException ue){
				System.out.println("Not supported : ");
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
	}
}