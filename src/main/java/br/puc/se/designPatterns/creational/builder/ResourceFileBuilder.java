package br.puc.se.designPatterns.creational.builder;

public class ResourceFileBuilder implements InputBuilder<String> {

    private Input<String> input;
    ResourceFileBuilder(){
        input = new Input<String>() {
            @Override
            public String getContent() {
                return "no content";
            }
        };
    }
    
    @Override
    public Input<String> build() {
        return this.input;
    }

    void fromResource(String simplecontenttxt) {
        this.input = new ResourceFileInput(simplecontenttxt);
    }

      

}
