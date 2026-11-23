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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Application System Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ApplicationSystemDirectory is an association used to establish a relationship between an ApplicationSystem and the Directories that it uses. This is used to identify the single root installation directory for an ApplicationSystem, as well as the logical purpose of other directories utilized by the ApplicationSystem. Note: This class is intended to be a subclass of CIM_Dependency but the current specification prohibits the extension of parent keys in a subclass. This will be revisited when the specification changes to make the intended inheritance possible.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getApplicationDirectoryUses <em>Application Directory Uses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getOtherUseDescriptions <em>Other Use Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemDirectory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::DeploymentModel' keys='Antecedent,Dependent,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ApplicationSystemDirectory extends EObject {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Directory which is used by the associated ApplicationSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent</em>' reference.
	 * @see #setAntecedent(CIM_Directory)
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemDirectory_Antecedent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Directory REF' Key='true'"
	 * @generated
	 */
	CIM_Directory getAntecedent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getAntecedent <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(CIM_Directory value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ApplicationSystem which depends upon the associated Directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent</em>' reference.
	 * @see #setDependent(CIM_ApplicationSystem)
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemDirectory_Dependent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ApplicationSystem REF' Key='true'"
	 * @generated
	 */
	CIM_ApplicationSystem getDependent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getDependent <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(CIM_ApplicationSystem value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name is a string representing a meaningful identifier for referring to the associated Directory in the context of the ApplicationSystem. As an example, this might be the name of the environment variable used to hold the same directory information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemDirectory_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ApplicationSystemDirectory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Application Directory Uses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ApplicationDirectoryUse is an enumerated array which indicates the purpose(s) of the associated directory within the context of the ApplicationSystem. A value of "Root" indicates that the associated directory is the one and only root directory for the ApplicationSystem. This would typically be the directory path in which the application is installed. For applications which are installed in multiple directories, this would represent the directory from which initial program and configuration files are loaded. A value of "Program" indicates that the directory contains supplemental program files used by the ApplicationSystem. A value of "Data" indicates that the directory is used for data storage. A value of "Log" indicates that the directory is used to contain log files for the ApplicationSystem. It is considered invalid for multiple associations from the same ApplicationSystem to have a value of "Root". The "Unknown" state is expected to be short-lived and would typically be seen only in the installation phase of an ApplicationSystem, if at all. A value of "Temp" indicates that the associated directory is used to contain temporary files created by the ApplicationSystem. The "Other" state should only be used in cases where none of the designated values are appropriate. This is intended to enable use of the model for unanticipated purposes and would usually signal a need to extend this enumeration through the standards process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Directory Uses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemDirectory_ApplicationDirectoryUses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Root\",\"Program\",\"Data\",\"Log\",\"Temp\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ApplicationSystemDirectory.OtherUseDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getApplicationDirectoryUses();

	/**
	 * Returns the value of the '<em><b>Other Use Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing how the ApplicationSystem utilizes the associated directory when the corresponding entry in ApplicationDirectoryUses is set to 1, "Other". This attribute is meaningless and should be null when the corresponding entry in ApplicationDirectoryUses is set to any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Use Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemDirectory_OtherUseDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ApplicationSystemDirectory.ApplicationDirectoryUses\"]'"
	 * @generated
	 */
	EList<String> getOtherUseDescriptions();

} // CIM_ApplicationSystemDirectory
