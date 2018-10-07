package _05_reflection_modifiers_annotations;

public @interface Author {
  public String name() default "";
}
