package net.sweenus.simplyskills.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "general")
public class GeneralConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip
    public boolean enableAscendancy = true;
    @ConfigEntry.Gui.Tooltip
    public boolean treeResetOnDeath = false;
    @ConfigEntry.Gui.Tooltip
    public boolean disableDefaultPuffishTrees = true;
    @ConfigEntry.Gui.Tooltip
    public boolean enableBuildSharing = false;
    @ConfigEntry.Gui.Tooltip
    public int skillChronicleCooldown = 12000;
    @ConfigEntry.Gui.Tooltip
    public boolean removeUnlockRestrictions = false;
    @ConfigEntry.Gui.Tooltip
    public float spellHasteCooldownReductionModifier = 0.8f;
    @ConfigEntry.Gui.Tooltip
    public int minimumAchievableCooldown = 5;
    @ConfigEntry.Gui.Tooltip
    public float minimumTimeBetweenAbilityUse = 0.5f;
    @ConfigEntry.Gui.Tooltip
    public int signatureHudX = 0;
    @ConfigEntry.Gui.Tooltip
    public int signatureHudY = 0;

    @ConfigEntry.Gui.Tooltip
    public boolean enableDDR = false;
    @ConfigEntry.Gui.Tooltip
    public boolean enableDDRDebugLog = false;
    @ConfigEntry.BoundedDiscrete(max = 50000)
    @ConfigEntry.Gui.Tooltip
    public int DDRHealthRequirement = 300;
    @ConfigEntry.BoundedDiscrete(max = 100)
    @ConfigEntry.Gui.Tooltip
    public int DDRHealthThreshold = 3;
    @ConfigEntry.BoundedDiscrete(max = 20)
    @ConfigEntry.Gui.Tooltip
    public int DDRAmount = 13;
    @ConfigEntry.BoundedDiscrete(max = 50)
    @ConfigEntry.Gui.Tooltip
    public int DDRAttackSpeedWeight = 20;
    @ConfigEntry.Gui.Tooltip
    public boolean DDRAffectsPlayers = false;

    @ConfigEntry.Gui.Tooltip
    public boolean enableDAS = false;
    @ConfigEntry.Gui.Tooltip
    public double DASHealth = 3.0;
    @ConfigEntry.Gui.Tooltip
    public double DASAttack = 0.2;
    @ConfigEntry.Gui.Tooltip
    public double DASArmor = 1.0;
    @ConfigEntry.Gui.Tooltip
    public double DASArmorToughness = 0.5;
    @ConfigEntry.Gui.Tooltip
    public double DASSpeed = 0.3;
    @ConfigEntry.Gui.Tooltip
    public double DASKnockbackResist = 0.1;

}
