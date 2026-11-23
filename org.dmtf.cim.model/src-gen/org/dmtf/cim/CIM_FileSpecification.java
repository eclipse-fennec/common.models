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
 * A representation of the model object '<em><b>CIM File Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FileSpecification identifies a file that is either to be on or off the system. The file is to be located in the directory identified in FileName, or by the CIM_Directory SpecificationFile association. When the Invoke methods are executed, it is expected that they will use a combination of information to check for file existence. Therefore, any of the properties with a NULL value are not checked. So, if only the FileName and MD5Checksum properties have values, they are the only ones considered by the Invoke methods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSpecification#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSpecification#getCreateTimeStamp <em>Create Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSpecification#getFileSize <em>File Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSpecification#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSpecification#getCRC1 <em>CRC1</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSpecification#getCRC2 <em>CRC2</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSpecification#getMD5Checksum <em>MD5 Checksum</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSpecification extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either the name of the file or the name of the file with a directory prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification_FileName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSpecification#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Create Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The creation date and time of the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Time Stamp</em>' attribute.
	 * @see #setCreateTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification_CreateTimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCreateTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSpecification#getCreateTimeStamp <em>Create Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Time Stamp</em>' attribute.
	 * @see #getCreateTimeStamp()
	 * @generated
	 */
	void setCreateTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the file in Kilobytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification_FileSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getFileSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSpecification#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(Long value);

	/**
	 * Returns the value of the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A checksum calculated as the 16-bit sum of the first 32 bytes of the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check Sum</em>' attribute.
	 * @see #setCheckSum(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification_CheckSum()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Software Signature|002.4\"]'"
	 * @generated
	 */
	Long getCheckSum();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSpecification#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(Long value);

	/**
	 * Returns the value of the '<em><b>CRC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CRC1 property is the CRC value calculated using the middle 512K bytes of the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRC1</em>' attribute.
	 * @see #setCRC1(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification_CRC1()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Software Signature|002.5\"]'"
	 * @generated
	 */
	Long getCRC1();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSpecification#getCRC1 <em>CRC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRC1</em>' attribute.
	 * @see #getCRC1()
	 * @generated
	 */
	void setCRC1(Long value);

	/**
	 * Returns the value of the '<em><b>CRC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CRC2 property is the CRC value for the middle 512K bytes of the file, modulo 3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRC2</em>' attribute.
	 * @see #setCRC2(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification_CRC2()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Software Signature|002.6\"]'"
	 * @generated
	 */
	Long getCRC2();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSpecification#getCRC2 <em>CRC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRC2</em>' attribute.
	 * @see #getCRC2()
	 * @generated
	 */
	void setCRC2(Long value);

	/**
	 * Returns the value of the '<em><b>MD5 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MD5 algorithm is a well-known algorithm for computing a 128-bit checksum for any file or object. For purposes of MOF specification of the MD5Checksum property, the MD5 algorithm always generates a 32 character string. For example: The string abcdefghijklmnopqrstuvwxyz generates the string c3fcd3d76192e4007dfb496cca67e13b. See http: //www.ietf.org - RFC1321 for details on the // implementation of the MD5 algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MD5 Checksum</em>' attribute.
	 * @see #setMD5Checksum(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSpecification_MD5Checksum()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32'"
	 * @generated
	 */
	String getMD5Checksum();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSpecification#getMD5Checksum <em>MD5 Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD5 Checksum</em>' attribute.
	 * @see #getMD5Checksum()
	 * @generated
	 */
	void setMD5Checksum(String value);

} // CIM_FileSpecification
