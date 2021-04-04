package features.report;

import cucumber.api.event.TestRunFinished;
import cucumber.api.event.TestSourceRead;
import cucumber.api.formatter.NiceAppendable;
import cucumber.runtime.CucumberException;
import features.report.enums.GherkinKeywordEnum;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomFormatter extends CustomFormatterEventListener {

    private NiceAppendable out;
    private Map<String, Integer> countByStatus = new HashMap<String, Integer>();

    public void finish(TestRunFinished event){
        StringBuffer slices = new StringBuffer();
        this.out.append("<html>\r\n");
        this.out.append("<head>\r\n");
        this.out.append("<meta charset=\"UTF-8\">\r\n");
        this.embedCss(Arrays.asList(new String[]{"/report/prism.css", "/report/style.css"}));
     // this.embedJs(Arrays.asList(new String[]{"/report/prism.css", "/report/style.css"}));
        this.out.append("\r\n");
        this.out.append("<script>\r\n");
        this.out.append("type=\"text/javascript\">\r\n");
        this.out.append("\r\n");
        this.out.append("google.charts.load(\"current\", {package:[\"corechart\"]});\r\n");
        this.out.append("google.charts.setOnLoadCallback(drawChart);\r\n");
        this.out.append("\r\n");
        this.out.append("function drawChart()\r\n");
        this.out.append("\r\n");
        this.out.append("var data = google.visualization.arrayToDataTable(\r\n");
        this.out.append("\r\n");
        this.out.append("['Status', 'Quantidade'],\r\n");

        Boolean isFirst = Boolean.TRUE;
        Integer index = 0;

        for (String status : this.countByStatus.keySet()){
            String color = "";
            if (status.equals("passed")) {
                color = "#e100ff";
            }

            }
        }


    private void embedCss(List<String> urls) {
        for (String url : urls) {
            this.out.append("\r\n");
            this.out.append("<style>\r\n");
            InputStream in = getClass().getResourceAsStream(url);
            BufferedReader br = null;

            try {
                br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                String line = br.readLine();
                while (line != null) {
                    this.out.append(line);
                    this.out.append("\r\n");
                    line = br.readLine();
                }
            } catch (UnsupportedEncodingException e) {
                throw new CucumberException("Não foi possível leo o CSS para adicionar no report: " + url, e);
            } catch (IOException e) {
                throw new CucumberException("Não foi possível leo o CSS para adicionar no report: " + url, e);
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            this.out.append("</style>\r\n");
        }
    }
}
