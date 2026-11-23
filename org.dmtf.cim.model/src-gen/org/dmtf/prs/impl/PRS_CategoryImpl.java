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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Category;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_CategoryImpl#getCategoryContents <em>Category Contents</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_CategoryImpl#getCategoryType <em>Category Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_CategoryImpl extends PRS_ExchangeElementImpl implements PRS_Category {
	/**
	 * The default value of the '{@link #getCategoryContents() <em>Category Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryContents()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryContents() <em>Category Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryContents()
	 * @generated
	 * @ordered
	 */
	protected String categoryContents = CATEGORY_CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryType() <em>Category Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryType()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryType() <em>Category Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryType()
	 * @generated
	 * @ordered
	 */
	protected String categoryType = CATEGORY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryContents() {
		return categoryContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryContents(String newCategoryContents) {
		String oldCategoryContents = categoryContents;
		categoryContents = newCategoryContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_CATEGORY__CATEGORY_CONTENTS, oldCategoryContents, categoryContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryType() {
		return categoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryType(String newCategoryType) {
		String oldCategoryType = categoryType;
		categoryType = newCategoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_CATEGORY__CATEGORY_TYPE, oldCategoryType, categoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_CATEGORY__CATEGORY_CONTENTS:
				return getCategoryContents();
			case PrsPackage.PRS_CATEGORY__CATEGORY_TYPE:
				return getCategoryType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrsPackage.PRS_CATEGORY__CATEGORY_CONTENTS:
				setCategoryContents((String)newValue);
				return;
			case PrsPackage.PRS_CATEGORY__CATEGORY_TYPE:
				setCategoryType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrsPackage.PRS_CATEGORY__CATEGORY_CONTENTS:
				setCategoryContents(CATEGORY_CONTENTS_EDEFAULT);
				return;
			case PrsPackage.PRS_CATEGORY__CATEGORY_TYPE:
				setCategoryType(CATEGORY_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrsPackage.PRS_CATEGORY__CATEGORY_CONTENTS:
				return CATEGORY_CONTENTS_EDEFAULT == null ? categoryContents != null : !CATEGORY_CONTENTS_EDEFAULT.equals(categoryContents);
			case PrsPackage.PRS_CATEGORY__CATEGORY_TYPE:
				return CATEGORY_TYPE_EDEFAULT == null ? categoryType != null : !CATEGORY_TYPE_EDEFAULT.equals(categoryType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CategoryContents: ");
		result.append(categoryContents);
		result.append(", CategoryType: ");
		result.append(categoryType);
		result.append(')');
		return result.toString();
	}

} //PRS_CategoryImpl
