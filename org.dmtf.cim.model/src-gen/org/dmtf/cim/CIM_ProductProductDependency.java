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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Product Product Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ProductProductDependency is an association between two Products, indicating that one must be installed, or must be absent, for the other to function. This is conceptually equivalent to the ServiceServiceDependency association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProductProductDependency#getRequiredProduct <em>Required Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProductProductDependency#getDependentProduct <em>Dependent Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProductProductDependency#getTypeOfDependency <em>Type Of Dependency</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductProductDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Core::ProductFRU' keys='RequiredProduct,DependentProduct'"
 * @generated
 */
@ProviderType
public interface CIM_ProductProductDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Product</em>' reference.
	 * @see #setRequiredProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductProductDependency_RequiredProduct()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true'"
	 * @generated
	 */
	CIM_Product getRequiredProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductProductDependency#getRequiredProduct <em>Required Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Product</em>' reference.
	 * @see #getRequiredProduct()
	 * @generated
	 */
	void setRequiredProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Dependent Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Product that is dependent on another Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Product</em>' reference.
	 * @see #setDependentProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductProductDependency_DependentProduct()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true'"
	 * @generated
	 */
	CIM_Product getDependentProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductProductDependency#getDependentProduct <em>Dependent Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Product</em>' reference.
	 * @see #getDependentProduct()
	 * @generated
	 */
	void setDependentProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Type Of Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nature of the Product dependency. This property describes that the associated Product must be installed (value=2) or must be absent (value=3) in order for the Product to function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Dependency</em>' attribute.
	 * @see #setTypeOfDependency(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductProductDependency_TypeOfDependency()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"Product Must Be Installed\",\"Product Must Not Be Installed\"]'"
	 * @generated
	 */
	Integer getTypeOfDependency();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductProductDependency#getTypeOfDependency <em>Type Of Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Dependency</em>' attribute.
	 * @see #getTypeOfDependency()
	 * @generated
	 */
	void setTypeOfDependency(Integer value);

} // CIM_ProductProductDependency
