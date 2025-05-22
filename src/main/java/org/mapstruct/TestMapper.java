package org.mapstruct;

@Mapper()
public abstract class TestMapper {
   public static class WithStatus<A> {
        public A value;
   }
   public static class Response {
       public Boolean result;
   }

   @Mapping(source = "result", target = "value")
   public abstract WithStatus<Boolean> fromResponse(Response response);
   //  C:\Work\Projects\Issue3807Mapper\src\main\java\org\mapstruct\TestMapper.java:12:5
   //  java: Can't map property "Boolean result" to "A value". Consider to declare/implement a mapping method: "A map(Boolean value)".
}
