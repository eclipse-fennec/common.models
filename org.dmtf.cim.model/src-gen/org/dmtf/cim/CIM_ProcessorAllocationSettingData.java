/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Processor Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ProcessorAllocationSettingData class represents resource allocation settings specifically related to the allocation of a processor (CPU).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProcessorAllocationSettingData#getProcessorArchitecture <em>Processor Architecture</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProcessorAllocationSettingData#getInstructionSet <em>Instruction Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProcessorAllocationSettingData#getInstructionSetExtensionName <em>Instruction Set Extension Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProcessorAllocationSettingData#getInstructionSetExtensionStatus <em>Instruction Set Extension Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorAllocationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Core::Resource' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ProcessorAllocationSettingData extends CIM_ResourceAllocationSettingData {
	/**
	 * Returns the value of the '<em><b>Processor Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the processor architecture of the processor, for programmatic use, using a structured string value (termed 'processor architecture string value').
	 * This property should not be used to distinguish instruction sets or instruction set extensions within a processor architecture; the InstructionSet and InstructionSetExtension properties are used for that.
	 * Different widths of memory addresses should be distinguished via separate processor architecture values if the corresponding instruction set architectures are sufficiently different.
	 * The processor architecture should not designate co-processors that only provide extensions to an instruction set, such as floating point units - these should be represented through instruction set extensions.
	 * The format for processor architecture string values shall conform to the 'arch' ABNF rule:
	 * arch = org-id ":" arch-id
	 * org-id = IDENTIFIER
	 * arch-id = INST-IDENTIFIER
	 * INST-IDENTIFIER = 1*( UPPERALPHA / LOWERALPHA / UNDERSCORE / DIGIT / "/" / "-" / ".")
	 * Org-id shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that defines the processor architecture string value, or that is a registered ID assigned to that business entity by a recognized global authority. In addition, to ensure uniqueness, org-id and arch-id shall not contain a colon (:). The business entity that defines the processor architecture string value does not need to own or maintain the definition of the processor architecture identified by the value.
	 * Arch-id shall be unique within org-id.
	 * IDENTIFIER, UPPERALPHA, LOWERALPHA, UNDERSCORE, DIGIT are defined in DSP0004.
	 * Processor architecture string values defined by DMTF shall have an org-id of 'DMTF' and are all defined in the ValueMap of this property.
	 * In addition to the values defined in its ValueMap, this property may have values not defined in its ValueMap. Subclasses may override the ValueMap (and Values) qualifiers to add additional values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor Architecture</em>' attribute.
	 * @see #setProcessorArchitecture(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorAllocationSettingData_ProcessorArchitecture()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ValueMap='[\"DMTF:x86\",\"DMTF:IA-64\",\"DMTF:AS/400\",\"DMTF:Power\",\"DMTF:S/390\",\"DMTF:PA-RISC\",\"DMTF:ARM\",\"DMTF:MIPS\",\"DMTF:Alpha\",\"DMTF:SPARC\",\"DMTF:68k\",\"DMTF:RISC-V\",\"DMTF:LoongArch\"]' Values='[\"Intel x86 (32-bit, 64-bit: x86-64, x64, AMD64, Intel64)\",\"Intel Itanium Architecture (IA-64, Itanium Processor Architecture (IPA))\",\"IBM AS/400 Architecture\",\"Power Architecture (incl. POWER, PowerPC, Cell)\",\"IBM System/390 and z/Architecture\",\"HP PA-RISC Architecture\",\"ARM Architecture\",\"MIPS Architecture\",\"Intel/DEC Alpha Architecture\",\"SPARC Architecture\",\"Motorola 68000 Family\",\"RISC-V Processor Architecture\",\"Loongson LoongArch (32-bit, 64-bit)\"]' ModelCorrespondence='[\"CIM_ProcessorAllocationSettingData.InstructionSet\",\"CIM_ProcessorAllocationSettingData.InstructionSetExtensionName\",\"CIM_ProcessorAllocationSettingData.InstructionSetExtensionStatus\"]'"
	 * @generated
	 */
	String getProcessorArchitecture();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProcessorAllocationSettingData#getProcessorArchitecture <em>Processor Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Architecture</em>' attribute.
	 * @see #getProcessorArchitecture()
	 * @generated
	 */
	void setProcessorArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Instruction Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the instruction set of the processor within a processor architecture, for programmatic use, using a structured string value (termed 'instruction set string value').
	 * The instruction set should not be used to distinguish instruction set extensions (the InstructionSetExtension property is used for that).
	 * The format for instruction set string values shall conform to the 'instset' ABNF rule:
	 * instset = org-id ":" arch-id ":" instset-id
	 * org-id = IDENTIFIER arch-id = INST-IDENTIFIER
	 * instset-id = INST-IDENTIFIER
	 * Org-id shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that defines the instruction set string value, or that is a registered ID assigned to that business entity by a recognized global authority. In addition, to ensure uniqueness, org-id, arch-id and instset-id shall not contain a colon (:). The business entity that defines the instruction set string value does not need to own or maintain the definition of the instruction set identified by the string value.
	 * Arch-id shall be unique within org-id.
	 * Instset-id shall be unique within arch-id.
	 * IDENTIFIER is defined in DSP0004.
	 * INST-IDENTIFIER is defined in the description of the ProcessorArchitecture property.
	 * Instruction set string values defined by DMTF shall have an org-id of 'DMTF' and are all defined in the ValueMap of this property.
	 * In addition to the values defined in its ValueMap, this property may have values not defined in its ValueMap. Subclasses may override the ValueMap (and Values) qualifiers to add additional values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction Set</em>' attribute.
	 * @see #setInstructionSet(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorAllocationSettingData_InstructionSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ValueMap='[\"DMTF:x86:i386\",\"DMTF:x86:i486\",\"DMTF:x86:i586\",\"DMTF:x86:i686\",\"DMTF:x86:64\",\"DMTF:IA-64:IA-64\",\"DMTF:AS/400:TIMI\",\"DMTF:Power:Power_2.03\",\"DMTF:Power:Power_2.04\",\"DMTF:Power:Power_2.05\",\"DMTF:Power:Power_2.06\",\"DMTF:S/390:ESA/390\",\"DMTF:S/390:z/Architecture\",\"DMTF:S/390:z/Architecture_2\",\"DMTF:PA-RISC:PA-RISC_1.0\",\"DMTF:PA-RISC:PA-RISC_2.0\",\"DMTF:ARM:A32\",\"DMTF:ARM:A64\",\"DMTF:MIPS:MIPS_I\",\"DMTF:MIPS:MIPS_II\",\"DMTF:MIPS:MIPS_III\",\"DMTF:MIPS:MIPS_IV\",\"DMTF:MIPS:MIPS_V\",\"DMTF:MIPS:MIPS32\",\"DMTF:MIPS64:MIPS64\",\"DMTF:Alpha:Alpha\",\"DMTF:SPARC:SPARC_V7\",\"DMTF:SPARC:SPARC_V8\",\"DMTF:SPARC:SPARC_V9\",\"DMTF:SPARC:SPARC_JPS1\",\"DMTF:SPARC:UltraSPARC2005\",\"DMTF:SPARC:UltraSPARC2007\",\"DMTF:68k:68000\",\"DMTF:68k:68010\",\"DMTF:68k:68020\",\"DMTF:68k:68030\",\"DMTF:68k:68040\",\"DMTF:68k:68060\",\"DMTF:RISC-V:RV32\",\"DMTF:RISC-V:RV64\",\"DMTF:RISC-V:RV128\",\"DMTF:LoongArch:LoongArch32\",\"LoongArch:LoongArch64\"]' Values='[\"x86 i386 instruction set\",\"x86 i486 instruction set\",\"x86 i586 instruction set\",\"x86 i686 instruction set\",\"x86 64-bit instruction set\",\"IA-64: Intel Itanium Architecture, incl. hardware multithreading and Intel Virtualization Technology (VT-i)\",\"IBM AS/400 TIMI (Technology Independent Machine Interface, 48-bit)\",\"Power ISA v2.03 (incl. IBM POWER5)\",\"Power ISA v2.04\",\"Power ISA v2.05 (incl. IBM POWER6)\",\"Power ISA v2.06 (incl. IBM POWER7)\",\"IBM ESA/390 (ARCHLVL 1, 31-bit)\",\"IBM z/Architecture 1 (ARCHLVL 2, 64-bit)\",\"IBM z/Architecture 2 (ARCHLVL 3, 64-bit)\",\"PA-RISC 1.0 (64-bit)\",\"PA-RISC 2.0 (64-bit)\",\"ARM A32 (AArch32, 32-bit)\",\"ARM A64 (AArch64, 64-bit)\",\"MIPS I (32-bit)\",\"MIPS II (32-bit)\",\"MIPS III (32-bit)\",\"MIPS IV (32-bit)\",\"MIPS V (32-bit)\",\"MIPS32 (32-bit)\",\"MIPS64 (64-bit)\",\"DEC Alpha (64-bit)\",\"SPARC V7 (32-bit)\",\"SPARC V8 (32-bit)\",\"SPARC V9 (64-bit)\",\"SPARC Joint Programming Specification 1 (64-bit)\",\"UltraSPARC Architecture 2005 (64-bit)\",\"UltraSPARC Architecture 2007 (64-bit)\",\"Motorola 68000/008 (24-bit)\",\"Motorola 68010/012 (24-bit)\",\"Motorola 68020 (32-bit)\",\"Motorola 68030 (32-bit)\",\"Motorola 68040 (32-bit)\",\"Motorola 68060 (32-bit)\",\"RISC-V 32-bit Base Integer ISA\",\"RISC-V 64-bit Base Integer ISA\",\"RISC-V 128-bit Base Integer ISA\",\"LoongArch32 (32-bit)\",\"LoongArch64 (64-bit)\"]' ModelCorrespondence='[\"CIM_ProcessorAllocationSettingData.ProcessorArchitecture\",\"CIM_ProcessorAllocationSettingData.InstructionSetExtensionName\",\"CIM_ProcessorAllocationSettingData.InstructionSetExtensionStatus\"]'"
	 * @generated
	 */
	String getInstructionSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProcessorAllocationSettingData#getInstructionSet <em>Instruction Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Set</em>' attribute.
	 * @see #getInstructionSet()
	 * @generated
	 */
	void setInstructionSet(String value);

	/**
	 * Returns the value of the '<em><b>Instruction Set Extension Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the instruction set extensions of the processor within a processor architecture, for programmatic use, using a structured string value (termed 'extension string value').
	 * Instruction set extensions provide instructions or capabilities in addition to instructions or capabilities provided by the instruction set that is being extended.
	 * The format for extension string values shall conform to the 'extension' ABNF rule:
	 * extension = org-id ":" arch-id ":" extension-id
	 * org-id = IDENTIFIER
	 * arch-id = INST-IDENTIFIER
	 * extension-id = INST-IDENTIFIER
	 * Org-id shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that defines the instruction set string value, or that is a registered ID assigned to that business entity by a recognized global authority. In addition, to ensure uniqueness, org-id, arch-id and instset-id shall not contain a colon (:). The business entity that defines the extension string value does not need to own or maintain the definition of the instruction set extension identified by the string value.
	 * Instset-id shall be unique within org-id.
	 * Arch-id shall be unique within org-id.
	 * IDENTIFIER is defined in DSP0004.
	 * INST-IDENTIFIER is defined in the description of the ProcessorArchitecture property.
	 * Extension string values defined by DMTF shall have an org-id of 'DMTF' and are all defined in the ValueMap of this property.
	 * In addition to the values defined in its ValueMap, this property may have values not defined in its ValueMap. Subclasses may override the ValueMap (and Values) qualifiers to add additional values.
	 * This array shall be index-correlated with the InstructionSetExtensionStatus array.
	 * The following older x86 instruction set features are not supported by the ValueMap of this property:
	 * - 3DNowPrefetch: PREFETCH and PREFETCHW instruction support
	 * - CLFSH: CLFLUSH instruction support
	 * - CMOV: conditional move instructions
	 * - CMPXCHG8B: CMPXCHG8B instruction
	 * - DE: debugging extensions
	 * - FXSR: FXSAVE and FXRSTOR instructions
	 * - LM: long mode
	 * - LahfSahf: LAHF and SAHF instruction support in 64-bit mode
	 * - MCA: Machine check architecture
	 * - MCE: Machine check exception
	 * - MONITOR: MONITOR/MWAIT instructions
	 * - MSR: AMD model-specific registers, with RDMSR and WRMSR instructions
	 * - MTRR: memory-type range registers
	 * - OSXSAVE: XSAVE (and related) instructions are enabled
	 * - PAE: physical-address extensions
	 * - PAT: page attribute table
	 * - PGE: page global extension
	 * - POPCNT: POPCNT instruction
	 * - PSE: page-size extensions
	 * - PSE36: page-size extensions
	 * - RDTSCP: RDTSCP instruction
	 * - SSE: SSE instructions (prefetch subset)
	 * - SKINIT: SKINIT and STGI are supported
	 * - SysEnterSysExit: SYSENTER and SYSEXIT instructions
	 * - TSC: Time Stamp Counter. RDTSC and RDTSCP instruction support
	 * - VME: Virtual-Mode Enhancements
	 * - WDT: Watch Dog Timer support
	 * - XSAVE: XSAVE (and related) instructions are supported by hardware
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction Set Extension Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorAllocationSettingData_InstructionSetExtensionName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ValueMap='[\"DMTF:x86:3DNow\",\"DMTF:x86:3DNowExt\",\"DMTF:x86:ABM\",\"DMTF:x86:AES\",\"DMTF:x86:AVX\",\"DMTF:x86:AVX2\",\"DMTF:x86:BMI\",\"DMTF:x86:CX16\",\"DMTF:x86:F16C\",\"DMTF:x86:FSGSBASE\",\"DMTF:x86:LWP\",\"DMTF:x86:MMX\",\"DMTF:x86:PCLMUL\",\"DMTF:x86:RDRND\",\"DMTF:x86:SSE2\",\"DMTF:x86:SSE3\",\"DMTF:x86:SSSE3\",\"DMTF:x86:SSE4A\",\"DMTF:x86:SSE41\",\"DMTF:x86:SSE42\",\"DMTF:x86:FMA3\",\"DMTF:x86:FMA4\",\"DMTF:x86:XOP\",\"DMTF:x86:TBM\",\"DMTF:x86:VT-d\",\"DMTF:x86:VT-x\",\"DMTF:x86:EPT\",\"DMTF:x86:SVM\",\"DMTF:PA-RISC:MAX\",\"DMTF:PA-RISC:MAX2\",\"DMTF:ARM:DSP\",\"DMTF:ARM:Jazelle-DBX\",\"DMTF:ARM:Thumb\",\"DMTF:ARM:Thumb-2\",\"DMTF:ARM:ThumbEE)\",\"DMTF:ARM:VFP\",\"DMTF:ARM:NEON\",\"DMTF:ARM:TrustZone\",\"DMTF:MIPS:MDMX\",\"DMTF:MIPS:MIPS-3D\",\"DMTF:Alpha:BWX\",\"DMTF:Alpha:FIX\",\"DMTF:Alpha:CIX\",\"DMTF:Alpha:MVI\",\"DMTF:RISC-V:A\",\"DMTF:RISC-V:B\",\"DMTF:RISC-V:C\",\"DMTF:RISC-V:D\",\"DMTF:RISC-V:F\",\"DMTF:RISC-V:J\",\"DMTF:RISC-V:L\",\"DMTF:RISC-V:M\",\"DMTF:RISC-V:N\",\"DMTF:RISC-V:P\",\"DMTF:RISC-V:Q\",\"DMTF:RISC-V:T\",\"DMTF:RISC-V:V\",\"DMTF:LoongArch:LBT\",\"DMTF:LoongArch:LVZ\",\"DMTF:LoongArch:LSX\",\"DMTF:LoongArch:LASX\"]' Values='[\"x86 3DNow: AMD 3DNow! instructions\",\"x86 3DNowExt: Extensions to AMD 3DNow! instructions\",\"x86 ABM: Advanced Bit Manipulation instructions: LZCNT\",\"x86 AES: Advanced Encryption Standard instructions: AES*, PCLMULQDQ\",\"x86 AVX: Advanced Vector Extensions\",\"x86 AVX2: Advanced Vector Extensions 2\",\"x86 BMI: Bit Manipulation Instructions: LZCNT, POPCNT\",\"x86 CX16: CMPXCHG16B instruction\",\"x86 F16C: Half-precision convert instructions\",\"x86 FSGSBASE: ?\",\"x86 LWP: Lightweight Profiling support\",\"x86 MMX: MMX instructions\",\"x86 PCLMUL: PCLMUL* instructions\",\"x86 RDRND: ?\",\"x86 SSE2: SSE2 instructions\",\"x86 SSE3: SSE3 instructions\",\"x86 SSSE3: Supplemental SSE3 instructions\",\"x86 SSE4A: SSE4A instructions: EXTRQ, INSERTQ, MOVNTSS, and MOVNTSD\",\"x86 SSE41: SSE4.1 instructions\",\"x86 SSE42: SSE4.2 instructions\",\"x86 FMA3: SSE5 Fused Multiply-Add 3 instructions\",\"x86 FMA4: SSE5 Fused Multiply-Add 4 instructions\",\"x86 XOP: SSE5 Extended Operation instructions\",\"x86 TBM: Trailing Bit Manipulation instructions\",\"x86 VT-d: Intel Virtualization Technology for Directed I/O\",\"x86 VT-x: Intel Virtualization Technology\",\"x86 EPT: Intel VT-x with Extended Page Tables\",\"x86 SVM: AMD virtualization (AMD-V, Secure Virtual Machine (SVM))\",\"PA-RISC Multimedia Acceleration eXtensions (MAX)\",\"PA-RISC Multimedia Acceleration eXtensions v2 (MAX2)\",\"ARM DSP enhancement instructions (DSP)\",\"ARM Jazelle DBX (Direct Bytecode eXecution)\",\"ARM Thumb mode\",\"ARM Thumb-2 mode\",\"ARM ThumbEE mode (Jazelle RCT (Runtime Compilation Target), Thumb-2EE)\",\"ARM Vector Floating Point (VFP) Extension\",\"ARM Advanced SIMD Extension (NEON, MPE (Media Processing Engine))\",\"ARM Security Extensions (TrustZone Technology)\",\"MIPS Digital Media eXtension (MDMX)\",\"MIPS instructions for 3D graphics operations (MIPS-3D)\",\"DEC Alpha Byte/Word Extension (BWX)\",\"DEC Alpha Square-root and Floating-point Convert Extension (FIX)\",\"DEC Alpha Count Extension (CIX)\",\"DEC Alpha Motion Video Instructions (MVI)\",\"RISC-V Atomic Instructions Standard Extension\",\"RISC-V Bit Manipulation Standard Extension\",\"RISC-V Compressed Instructions Standard Extension\",\"RISC-V Double-Precision Floating-Point Standard Extension\",\"RISC-V Single-Precision Floating-Point Standard Extension\",\"RISC-V Dynamically Translated Languages Standard Extension\",\"RISC-V Decimal Floating-Point Standard Extension\",\"RISC-V Integer Multiplication and Division Standard Extension\",\"RISC-V User-Level Interrupts Standard Extension\",\"RISC-V Packed-SIMD Instructions Standard Extension\",\"RISC-V Quad-Precision Floating-Point Standard Extension\",\"RISC-V Transactional Memory Standard Extension\",\"RISC-V Vector Operations Standard Extension\",\"LoongArch LBT: Loongson Binary Translation\",\"LoongArch LVZ: Loongson Virtualization\",\"LoongArch LSX: Loongson SIMD Extension\",\"LoongArch LASX: Loongson Advanced SIMD Extension\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ProcessorAllocationSettingData.ProcessorArchitecture\",\"CIM_ProcessorAllocationSettingData.InstructionSet\",\"CIM_ProcessorAllocationSettingData.InstructionSetExtensionStatus\"]'"
	 * @generated
	 */
	EList<String> getInstructionSetExtensionName();

	/**
	 * Returns the value of the '<em><b>Instruction Set Extension Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enablement status of the instruction set extensions specified in the corresponding array elements of the InstructionSetExtensionName property, for programmatic use.
	 * This array shall be index-correlated with the InstructionSetExtensionName array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction Set Extension Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorAllocationSettingData_InstructionSetExtensionStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ValueMap='[\"Unknown\",\"Enabled\",\"Disabled\"]' Values='[\"The enablement status of the extension is unknown\",\"The extension is currently enabled\",\"The extension is currently disabled\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ProcessorAllocationSettingData.ProcessorArchitecture\",\"CIM_ProcessorAllocationSettingData.InstructionSet\",\"CIM_ProcessorAllocationSettingData.InstructionSetExtensionName\"]'"
	 * @generated
	 */
	EList<String> getInstructionSetExtensionStatus();

} // CIM_ProcessorAllocationSettingData
