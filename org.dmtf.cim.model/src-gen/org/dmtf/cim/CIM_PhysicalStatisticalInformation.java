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
 * A representation of the model object '<em><b>CIM Physical Statistical Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information associated with a PhysicalElement or one of its subclasses.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalStatisticalInformation#getPhysicalCreationClassName <em>Physical Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalStatisticalInformation#getTag <em>Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalStatisticalInformation#getCreationClassName <em>Creation Class Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalStatisticalInformation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Core::Statistics' override.Name='string' override.Name.Key='true' override.Name.Description='The Name property, inherited from StatisticalInformation, serves as part of the object key.' override.Name.MaxLen='256' keys='PhysicalCreationClassName,Tag,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalStatisticalInformation extends CIM_StatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Physical Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Element's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Creation Class Name</em>' attribute.
	 * @see #setPhysicalCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalStatisticalInformation_PhysicalCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_PhysicalElement.CreationClassName'"
	 * @generated
	 */
	String getPhysicalCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalStatisticalInformation#getPhysicalCreationClassName <em>Physical Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Creation Class Name</em>' attribute.
	 * @see #getPhysicalCreationClassName()
	 * @generated
	 */
	void setPhysicalCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Element's identifying Tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalStatisticalInformation_Tag()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_PhysicalElement.Tag'"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalStatisticalInformation#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalStatisticalInformation_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalStatisticalInformation#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

} // CIM_PhysicalStatisticalInformation
