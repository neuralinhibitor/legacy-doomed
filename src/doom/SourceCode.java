/*
 * Copyright (C) 2017 Good Sign
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package doom;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.SOURCE;

@Target({})
@Retention(SOURCE)
public @interface SourceCode {
    
    public enum D_Main {
        D_DoomLoop,
        D_ProcessEvents;
        @Documented
        @Retention(SOURCE) public
        @interface C { D_Main value(); }
    }
    
    public enum G_Game {
        G_PlayerReborn,
        G_CheckSpot,
        G_DeathMatchSpawnPlayer,
        G_InitNew,
        G_DeferedInitNew,
        G_DeferedPlayDemo,
        G_LoadGame,
        G_DoLoadGame,
        G_SaveGame,
        G_RecordDemo,
        G_BeginRecording,
        G_PlayDemo,
        G_TimeDemo,
        G_CheckDemoStatus,
        G_ExitLevel,
        G_SecretExitLevel,
        G_WorldDone,
        G_Ticker,
        G_Responder,
        G_ScreenShot;
        @Documented
        @Retention(SOURCE) public
        @interface C { G_Game value(); }
    }
    
    public enum I_IBM {
        I_GetTime,
        I_WaitVBL,
        I_SetPalette,
        I_FinishUpdate,
        I_StartTic,
        I_InitNetwork,
        I_NetCmd;
        @Documented
        @Retention(SOURCE) public
        @interface C { I_IBM value(); }
    }

    public enum M_Argv {
        M_CheckParm;
        @Documented
        @Retention(SOURCE) public
        @interface C { M_Argv value(); }
    }
    
    public enum M_Menu {
        M_Responder,
        M_Ticker,
        M_Drawer,
        M_Init,
        M_StartControlPanel;
        @Documented
        @Retention(SOURCE) public
        @interface C { M_Menu value(); }
    }
    
    public enum M_Random {
        M_Random,
        P_Random,
        M_ClearRandom;
        @Documented
        @Retention(SOURCE) public
        @interface C { M_Random value(); }
    }
    
    public enum P_Map {
        P_CheckPosition,
        PIT_CheckThing,
        PIT_CheckLine,
        PIT_RadiusAttack,
        PIT_ChangeSector,
        PIT_StompThing,
        PTR_SlideTraverse,
        PTR_AimTraverse,
        PTR_ShootTraverse,
        PTR_UseTraverse;
        @Documented
        @Retention(SOURCE) public
        @interface C { P_Map value(); }
    }
    
    public enum P_MapUtl {
        P_BlockThingsIterator,
        P_BlockLinesIterator,
        P_PathTraverse,
        P_UnsetThingPosition,
        PIT_AddLineIntercepts,
        PIT_AddThingIntercepts;
        @Documented
        @Retention(SOURCE) public
        @interface C { P_MapUtl value(); }
    }
    
    public enum P_Mobj {
        G_PlayerReborn,
        P_SpawnMapThing,
        P_SetMobjState,
        P_ExplodeMissile,
        P_XYMovement,
        P_ZMovement,
        P_NightmareRespawn,
        P_MobjThinker,
        P_SpawnMobj,
        P_RemoveMobj,
        P_RespawnSpecials,
        P_SpawnPlayer,
        P_SpawnPuff,
        P_SpawnBlood,
        P_CheckMissileSpawn,
        P_SpawnMissile,
        P_SpawnPlayerMissile;
        @Documented
        @Retention(SOURCE) public
        @interface C { P_Mobj value(); }
    }
    
    public enum P_Enemy {
        PIT_VileCheck;
        @Documented
        @Retention(SOURCE) public
        @interface C { P_Enemy value(); }
    }
    
    public enum P_Tick {
        P_InitThinkers,
        P_RemoveThinker,
        P_AddThinker,
        P_AllocateThinker,
        P_RunThinkers,
        P_Ticker;
        @Documented
        @Retention(SOURCE) public
        @interface C { P_Tick value(); }
    }
    
    public enum R_Main {
        R_PointOnSide,
        R_PointOnSegSide,
        R_PointToAngle,
        R_PointToAngle2,
        R_PointToDist,
        R_ScaleFromGlobalAngle,
        R_PointInSubsector,
        R_AddPointToBox,
        R_RenderPlayerView,
        R_Init,
        R_SetViewSize;
        @Documented
        @Retention(SOURCE) public
        @interface C { R_Main value(); }
    }
    
    public enum W_Wad {
        W_InitMultipleFiles,
        W_Reload,
        W_CheckNumForName,
        W_GetNumForName,
        W_LumpLength,
        W_ReadLump,
        W_CacheLumpNum,
        W_CacheLumpName;
        @Documented
        @Retention(SOURCE) public
        @interface C { W_Wad value(); }
    }

    @Documented
    @Retention(SOURCE)
    @Target({FIELD, LOCAL_VARIABLE, PARAMETER})
    public @interface angle_t {}
    
    @Documented
    @Retention(SOURCE)
    @Target({FIELD, LOCAL_VARIABLE, PARAMETER})
    public @interface fixed_t {}
}
