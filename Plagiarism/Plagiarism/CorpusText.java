package Plagiarism;

import java.util.*;

/**
 * 
 */
public class CorpusText {

    private String text1="Sed lacus ex, tincidunt sed leo id, volutpat semper nulla. Phasellus at varius augue. Duis pellentesque quam tortor, quis dictum lectus posuere vel. Fusce gravida sagittis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed mollis augue ac elementum aliquet. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Duis id augue at arcu faucibus aliquet a at quam.";
    private String text2="Nam consectetur lectus non nisl varius cursus. Cras faucibus sed felis vel rhoncus. Curabitur a dolor nec massa mattis tincidunt. Proin malesuada efficitur mi, id sollicitudin nunc ullamcorper ut. Integer diam lectus, ornare vel tempor nec, molestie et velit. Nunc sollicitudin turpis tellus, vel vestibulum libero ullamcorper id. Ut varius venenatis turpis, non blandit purus fermentum vitae. Fusce vulputate felis eu tellus varius, id eleifend nisi scelerisque. Vivamus pharetra a mauris lacinia vestibulum. Praesent pretium at elit vel dignissim. In malesuada, dui et rhoncus congue, ante mi porta neque, et congue nisl enim sit amet metus. Duis vulputate egestas est, et dapibus orci porttitor vel. ";
    private String text3="Nam venenatis eros vitae nibh commodo suscipit. Proin vulputate turpis vel felis mollis, nec mollis quam mattis. Nullam cursus vestibulum erat. Praesent vel nulla arcu. Donec rutrum tellus elit, sit amet ornare ex suscipit sit amet. Nunc feugiat posuere sagittis. Aliquam erat volutpat. Pellentesque blandit vitae nulla vitae iaculis. Donec efficitur eleifend risus eget mollis. Proin id posuere felis. Morbi eget finibus est, vitae malesuada massa. In at dui a felis tempus iaculis. Curabitur ut nisl sollicitudin, scelerisque dui eu, iaculis nibh. Aenean luctus velit vel mattis lobortis. ";
    		
    private String[] library = {text1,text2,text3};
    
    public CorpusText() {
    }

    public String getText(int nb) {
    	return library[nb - 1];
    	//return text1;
    }
}