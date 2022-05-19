package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Shape Collector Test.")

public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("Test Circle")
    class TestCircle {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle1 = new Circle("Circle1", 65);
            //When
            shapeCollector.addFigure(circle1);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeList().size());
            System.out.println("1" + "vs" + shapeCollector.getShapeList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle1 = new Circle("Circle1", 65);
            shapeCollector.addFigure(circle1);
            //When
            shapeCollector.getShapeList().remove(0);
            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeList().size());
            System.out.println("0" + "vs" + shapeCollector.getShapeList().size());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle("Circle1", 65);
            Shape shape2 = new Circle("Cirlce2", 84);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            //When
            shapeCollector.getShapeList().get(0);
            //Then
            Assertions.assertEquals(shape1, shapeCollector.getShapeList().get(0));
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle1", 65);
            shapeCollector.addFigure(shape);
            List<Shape> shapeList1 = new ArrayList<>();
            shapeList1.add(shape);
            //When
            List<Shape> shapeCollectorList = shapeCollector.getShapeList();
            //Then
            Assertions.assertEquals(shapeList1.toString(), shapeCollectorList.toString());
        }
    }

    @Nested
    @DisplayName("Test Square")
    class TestSquare {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square("Square1", 55);
            //When
            shapeCollector.addFigure(square1);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeList().size());
            System.out.println("1" + "vs" + shapeCollector.getShapeList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square("Square1", 55);
            shapeCollector.addFigure(square1);
            //When
            shapeCollector.getShapeList().remove(0);
            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeList().size());
            System.out.println("0" + "vs" + shapeCollector.getShapeList().size());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square("Square1", 55);
            shapeCollector.addFigure(square1);
            //When
            shapeCollector.getShapeList().get(0);
            //Then
            Assertions.assertEquals(square1, shapeCollector.getShapeList().get(0));
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square("Square1", 55);
            shapeCollector.addFigure(square1);
            List<Shape> shapeList1 = new ArrayList<>();
            shapeList1.add(square1);
            //When
            List<Shape> shapeCollectorList = shapeCollector.getShapeList();
            //Then
            Assertions.assertEquals(shapeList1.toString(), shapeCollectorList.toString());
        }
    }
    @Nested
    @DisplayName("Test Triangle")
    class TestTriangle {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle("Triangle1", 55);
            //When
            shapeCollector.addFigure(triangle1);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeList().size());
            System.out.println("1" + "vs" + shapeCollector.getShapeList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle("Triangle1", 55);
            shapeCollector.addFigure(triangle1);
            //When
            shapeCollector.getShapeList().remove(0);
            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeList().size());
            System.out.println("0" + "vs" + shapeCollector.getShapeList().size());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle("Triangle1", 55);
            shapeCollector.addFigure(triangle1);
            //When
            shapeCollector.getShapeList().get(0);
            //Then
            Assertions.assertEquals(triangle1, shapeCollector.getShapeList().get(0));
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle("Triangle1", 55);
            shapeCollector.addFigure(triangle1);
            List<Shape> shapeList1 = new ArrayList<>();
            shapeList1.add(triangle1);
            //When
            List<Shape> shapeCollectorList = shapeCollector.getShapeList();
            //Then
            Assertions.assertEquals(shapeList1.toString(), shapeCollectorList.toString());
        }
    }
}
