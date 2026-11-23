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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Category is used to classify the components of a Solution. Hierarchical classifications are created by associating PRS_CategoryParentChild with multiple PRS_Category instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Category#getCategoryContents <em>Category Contents</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Category#getCategoryType <em>Category Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Category()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Category extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Category Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific value for the category. For example, 'HP Laserjet' would be a value for a category containing printer names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category Contents</em>' attribute.
	 * @see #setCategoryContents(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Category_CategoryContents()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCategoryContents();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Category#getCategoryContents <em>Category Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Contents</em>' attribute.
	 * @see #getCategoryContents()
	 * @generated
	 */
	void setCategoryContents(String value);

	/**
	 * Returns the value of the '<em><b>Category Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of category. Used to give additional semantics to the category. For example, a Category of Type 'Printers' would qualify the list of category values for a list of printers. 
	 * 
	 * Note: the relationship of Category Type to Category Value expresses no intrinsic hierarchy. If a tree of relationships exists to define categories and sub-categories, this should be defined using CategoryParentChild associations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category Type</em>' attribute.
	 * @see #setCategoryType(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Category_CategoryType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCategoryType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Category#getCategoryType <em>Category Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Type</em>' attribute.
	 * @see #getCategoryType()
	 * @generated
	 */
	void setCategoryType(String value);

} // PRS_Category
