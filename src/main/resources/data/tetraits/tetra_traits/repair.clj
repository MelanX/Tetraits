(fn [evt]
  (let [stack (-> (.getEntityLiving evt)
                  (TetraitsAPI.EntityHelper/getHeldItemMainhand))]
    (as-> (TetraitsAPI.ItemStackHelper/getDamage stack) $
          (- $ 1)
          (java.lang.Math/max 0 $)
          (TetraitsAPI.ItemStackHelper/setDamage stack $))))