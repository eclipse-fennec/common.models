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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Unix Process Statistical Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The statistics associated with a Unix process.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getOSCreationClassName <em>OS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getOSName <em>OS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getProcessCreationClassName <em>Process Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCPUTime <em>CPU Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getRealText <em>Real Text</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getRealData <em>Real Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getRealStack <em>Real Stack</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualText <em>Virtual Text</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualData <em>Virtual Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualStack <em>Virtual Stack</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualMemoryMappedFileSize <em>Virtual Memory Mapped File Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualSharedMemory <em>Virtual Shared Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCpuTimeDeadChildren <em>Cpu Time Dead Children</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getSystemTimeDeadChildren <em>System Time Dead Children</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.17.0' UMLPackagePath='CIM::System::Unix' override.Name='string' override.Name.Key='true' override.Name.Description='A string used to identify the related statistics of a Process. This key allows multiple instances of statistics to correspond to a single process. The multiple instances could be used in applications such as time-sliced statistics.' override.Name.MaxLen='256' keys='CSCreationClassName,CSName,OSCreationClassName,OSName,Handle,ProcessCreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_UnixProcessStatisticalInformation extends CIM_StatisticalInformation {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process's ComputerSystem CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.CSCreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #getCSCreationClassName()
	 * @generated
	 */
	void setCSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process's ComputerSystem Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.CSName'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>OS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process's OperatingSystem CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Creation Class Name</em>' attribute.
	 * @see #setOSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_OSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.OSCreationClassName'"
	 * @generated
	 */
	String getOSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getOSCreationClassName <em>OS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Creation Class Name</em>' attribute.
	 * @see #getOSCreationClassName()
	 * @generated
	 */
	void setOSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>OS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process's OperatingSystem Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Name</em>' attribute.
	 * @see #setOSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_OSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.OSName'"
	 * @generated
	 */
	String getOSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getOSName <em>OS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Name</em>' attribute.
	 * @see #getOSName()
	 * @generated
	 */
	void setOSName(String value);

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process's Handle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_Handle()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.Handle'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Process Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Process's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Creation Class Name</em>' attribute.
	 * @see #setProcessCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_ProcessCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Process.CreationClassName'"
	 * @generated
	 */
	String getProcessCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getProcessCreationClassName <em>Process Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Creation Class Name</em>' attribute.
	 * @see #getProcessCreationClassName()
	 * @generated
	 */
	void setProcessCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CPU Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of a CPU's time this process is consuming.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CPU Time</em>' attribute.
	 * @see #setCPUTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_CPUTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Percent' MappingStrings='[\"MIF.DMTF|Process Information|001.12\"]' PUnit='percent'"
	 * @generated
	 */
	Long getCPUTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCPUTime <em>CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU Time</em>' attribute.
	 * @see #getCPUTime()
	 * @generated
	 */
	void setCPUTime(Long value);

	/**
	 * Returns the value of the '<em><b>Real Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of real text space used by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Text</em>' attribute.
	 * @see #setRealText(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_RealText()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.15\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getRealText();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getRealText <em>Real Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Text</em>' attribute.
	 * @see #getRealText()
	 * @generated
	 */
	void setRealText(Long value);

	/**
	 * Returns the value of the '<em><b>Real Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of real data space used by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Data</em>' attribute.
	 * @see #setRealData(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_RealData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.16\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getRealData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getRealData <em>Real Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Data</em>' attribute.
	 * @see #getRealData()
	 * @generated
	 */
	void setRealData(Long value);

	/**
	 * Returns the value of the '<em><b>Real Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of real stack space used by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Stack</em>' attribute.
	 * @see #setRealStack(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_RealStack()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.17\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getRealStack();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getRealStack <em>Real Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Stack</em>' attribute.
	 * @see #getRealStack()
	 * @generated
	 */
	void setRealStack(Long value);

	/**
	 * Returns the value of the '<em><b>Virtual Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of virtual text space used by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Text</em>' attribute.
	 * @see #setVirtualText(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_VirtualText()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.18\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getVirtualText();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualText <em>Virtual Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Text</em>' attribute.
	 * @see #getVirtualText()
	 * @generated
	 */
	void setVirtualText(Long value);

	/**
	 * Returns the value of the '<em><b>Virtual Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of virtual data space used by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Data</em>' attribute.
	 * @see #setVirtualData(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_VirtualData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.19\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getVirtualData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualData <em>Virtual Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Data</em>' attribute.
	 * @see #getVirtualData()
	 * @generated
	 */
	void setVirtualData(Long value);

	/**
	 * Returns the value of the '<em><b>Virtual Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of virtual stack space used by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Stack</em>' attribute.
	 * @see #setVirtualStack(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_VirtualStack()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.20\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getVirtualStack();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualStack <em>Virtual Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Stack</em>' attribute.
	 * @see #getVirtualStack()
	 * @generated
	 */
	void setVirtualStack(Long value);

	/**
	 * Returns the value of the '<em><b>Virtual Memory Mapped File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of virtual space used for memory mapped files by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Memory Mapped File Size</em>' attribute.
	 * @see #setVirtualMemoryMappedFileSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_VirtualMemoryMappedFileSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.22\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getVirtualMemoryMappedFileSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualMemoryMappedFileSize <em>Virtual Memory Mapped File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Memory Mapped File Size</em>' attribute.
	 * @see #getVirtualMemoryMappedFileSize()
	 * @generated
	 */
	void setVirtualMemoryMappedFileSize(Long value);

	/**
	 * Returns the value of the '<em><b>Virtual Shared Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of KiloBytes of shared memory used by the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Shared Memory</em>' attribute.
	 * @see #setVirtualSharedMemory(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_VirtualSharedMemory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Process Information|001.21\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getVirtualSharedMemory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getVirtualSharedMemory <em>Virtual Shared Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Shared Memory</em>' attribute.
	 * @see #getVirtualSharedMemory()
	 * @generated
	 */
	void setVirtualSharedMemory(Long value);

	/**
	 * Returns the value of the '<em><b>Cpu Time Dead Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CPU time of terminated child processes in clock ticks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpu Time Dead Children</em>' attribute.
	 * @see #setCpuTimeDeadChildren(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_CpuTimeDeadChildren()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Clock Ticks' Counter='true' PUnit='count'"
	 * @generated
	 */
	Long getCpuTimeDeadChildren();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getCpuTimeDeadChildren <em>Cpu Time Dead Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Time Dead Children</em>' attribute.
	 * @see #getCpuTimeDeadChildren()
	 * @generated
	 */
	void setCpuTimeDeadChildren(Long value);

	/**
	 * Returns the value of the '<em><b>System Time Dead Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System time of terminated child processes in clock ticks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Time Dead Children</em>' attribute.
	 * @see #setSystemTimeDeadChildren(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatisticalInformation_SystemTimeDeadChildren()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Clock Ticks' Counter='true' PUnit='count'"
	 * @generated
	 */
	Long getSystemTimeDeadChildren();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixProcessStatisticalInformation#getSystemTimeDeadChildren <em>System Time Dead Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Time Dead Children</em>' attribute.
	 * @see #getSystemTimeDeadChildren()
	 * @generated
	 */
	void setSystemTimeDeadChildren(Long value);

} // CIM_UnixProcessStatisticalInformation
