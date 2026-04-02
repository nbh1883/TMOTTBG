# Take Me Out to the Ball Game ⚾

A Java Applet that renders a top-down baseball stadium — complete with field, infield dirt, bases, coach's boxes, and grandstands — set to the sound of Fenway Park's crowd singing *Take Me Out to the Ball Game*.

Built as a freshman year final project (Spring 2018) at Prosper High School.

## Preview

The applet draws a full baseball diamond from an aerial perspective, including:

- **Outfield** — green arc with foul lines extending from home plate
- **Infield** — dirt diamond with a grass cutout, pitcher's mound, and all four bases (home plate rendered as a proper pentagon)
- **Coach's boxes** — outlined along the first and third base lines
- **Stadium stands** — layered gray grandstands wrapping behind the outfield wall

## Project Structure

```
TTOTTBG/
├── TakeMeOutToTheBallGame.java   # Main applet — composes Stadium + Field
├── Field.java                     # Draws the baseball diamond and infield detail
├── Stadium.java                   # Draws the surrounding grandstands
├── Stands.java                    # Earlier/simpler version of the stands
├── BaseballField.java             # Early prototype of the field (single line)
├── SoundTest.java                 # Audio playback test using sun.audio
├── SoundAnimation.java            # Alternate audio test using javax.sound
└── bos.wav                        # Fenway Park crowd audio clip
```

## How It Works

`TakeMeOutToTheBallGame.java` extends `Applet` and calls static draw methods from the component classes in its `paint()` method:

```java
public void paint(Graphics g) {
    Stadium.drawStadium(g);
    Field.drawField(g);
}
```

Everything is drawn with Java AWT primitives — `fillPolygon`, `fillArc`, `drawLine`, and manual `Polygon` construction for each base, coach's box, and stand section. No images, no libraries, just math and coordinates.

## Contributors

| Name | Contribution |
|------|-------------|
| **Noah Hunter** | Field rendering (`Field.java`) |
| **Saransh Raina** | Stadium and stands (`Stadium.java`) |

## Running It

This was built for the Java Applet framework, which has since been deprecated. To run it today:

1. **As an applet (legacy):** Use an older JDK (8 or earlier) with `appletviewer` and an HTML file:
   ```html
   <applet code="TakeMeOutToTheBallGame.class" width="1000" height="700"></applet>
   ```
   ```bash
   javac *.java
   appletviewer applet.html
   ```

2. **As a standalone app (modern):** Wrap the applet in a `JFrame` — replace the `Applet` with a `JPanel` and add it to a frame with `setVisible(true)`.

## Tech

- **Language:** Java (JDK 8)
- **Graphics:** AWT (`java.awt.Graphics`, `java.awt.Polygon`)
- **Audio:** `sun.audio.AudioStream` (proprietary Sun API)
- **Era:** Spring 2018

## License

Academic project — no license. Just vibes and coordinate geometry.
