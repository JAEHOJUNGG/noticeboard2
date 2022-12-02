package com.example.noticeboard2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {
    /**TilesConfigurer 는 아파치 타일즈로 타일 정의를 불러오고 배치시킴**/
    @Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer tilesConfigurer = new TilesConfigurer();
        // Definitions  추가 (tiles.xml 경로 설정)
        //다수의 타일-정의 파일을 명시하기 위해 위치 패스에 와일드카드를 사용하는 것도 가능하다.
        //"/WEB-INF/**/tiles.xml"과 같이 /WEB-INF/이하의 디렉터리에서 tiles.xml 을 찾기를 원할때 사용한다.
        tilesConfigurer.setDefinitions(new String[]{"WEB-INF/tiles/tiles.xml"});
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }
    /**TilesViewResolver 는 논리적 view 이름으로 타일 정의를 참조하는 뷰를 결정하도록 함
     논리적 뷰 이름과 일치하는 이름의 타일 정의를 찾도록 수행 시키는 역할 인듯?**/
    @Bean
    public TilesViewResolver tilesViewResolver(){
        return new TilesViewResolver();
    }
}