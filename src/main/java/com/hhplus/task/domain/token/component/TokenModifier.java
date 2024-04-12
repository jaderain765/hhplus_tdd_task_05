package com.hhplus.task.domain.token.component;

import com.hhplus.task.domain.token.infrastructure.TokenJpaRepository;
import com.hhplus.task.domain.token.repositories.TokenStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TokenModifier {

    private TokenStoreRepository tokenStoreRepository;

    /**
     * 토큰 삭제
     *
     * @param tokenUUID
     */
    public void discardToken(String tokenUUID){
        tokenStoreRepository.deleteById(tokenUUID);
    }
}
