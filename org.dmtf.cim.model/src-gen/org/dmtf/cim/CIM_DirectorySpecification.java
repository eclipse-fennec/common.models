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
 * A representation of the model object '<em><b>CIM Directory Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DirectorySpecification class captures the major directory structure of a SoftwareElement. This class is used to organize the files of a SoftwareElement into manageable units that can be relocated on a computer system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DirectorySpecification#getDirectoryType <em>Directory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DirectorySpecification#getDirectoryPath <em>Directory Path</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DirectorySpecification()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_DirectorySpecification extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Directory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DirectoryType property characterizes the type of directory being described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory Type</em>' attribute.
	 * @see #setDirectoryType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DirectorySpecification_DirectoryType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\"]' Values='[\"Product base directory\",\"Product executable directory\",\"Product library directory\",\"Product configuration directory\",\"Product include directory\",\"Product working directory\",\"Product log directory\",\"Shared base directory\",\"Shared executable directory\",\"Shared library directory\",\"Shared include directory\",\"System base directory\",\"System executable directory\",\"System library directory\",\"System configuration directory\",\"System include directory\",\"System log directory\",\"Other\"]' MappingStrings='[\"MIF.DMTF|Location|001.2\"]'"
	 * @generated
	 */
	Integer getDirectoryType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DirectorySpecification#getDirectoryType <em>Directory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Type</em>' attribute.
	 * @see #getDirectoryType()
	 * @generated
	 */
	void setDirectoryType(Integer value);

	/**
	 * Returns the value of the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DirectoryPath property is used to capture the name of a directory. The value supplied by an application provider is actually a default or recommended path name. The value can be changed for a particular environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory Path</em>' attribute.
	 * @see #setDirectoryPath(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DirectorySpecification_DirectoryPath()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getDirectoryPath();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DirectorySpecification#getDirectoryPath <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Path</em>' attribute.
	 * @see #getDirectoryPath()
	 * @generated
	 */
	void setDirectoryPath(String value);

} // CIM_DirectorySpecification
