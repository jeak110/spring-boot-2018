package my.spring.boot.demo;

import media_player.MediaDevice;
import media_player.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MediaPlayerRestController {

    @Autowired
    private Map<String, MediaDevice> devices;

    @RequestMapping("play")
    public String play(@RequestParam("device") String device) {
        if (devices.get(device) != null) {
            devices.get(device).play();
        }
        return "play";
    }
}
