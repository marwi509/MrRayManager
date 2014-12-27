package mr.manager.ray.rendering;

import mr.manager.ray.image.Image;
import mr.manager.ray.scene.Scene;

public final class RenderContext {

    private final Image image;
    private final Scene scene;

    public RenderContext(Image image, Scene scene) {
        this.image = image;
        this.scene = scene;
    }

    public Image getImage() {
        return image;
    }

    public Scene getScene() {
        return scene;
    }
}
