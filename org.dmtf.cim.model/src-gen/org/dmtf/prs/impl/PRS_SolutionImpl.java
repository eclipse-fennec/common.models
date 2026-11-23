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

import org.dmtf.prs.PRS_Solution;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_SolutionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_SolutionImpl#getSolutionAbstract <em>Solution Abstract</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_SolutionImpl#getSolutionType <em>Solution Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_SolutionImpl extends PRS_ExchangeElementImpl implements PRS_Solution {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolutionAbstract() <em>Solution Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLUTION_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolutionAbstract() <em>Solution Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionAbstract()
	 * @generated
	 * @ordered
	 */
	protected String solutionAbstract = SOLUTION_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolutionType() <em>Solution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SOLUTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolutionType() <em>Solution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionType()
	 * @generated
	 * @ordered
	 */
	protected Integer solutionType = SOLUTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SOLUTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSolutionAbstract() {
		return solutionAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolutionAbstract(String newSolutionAbstract) {
		String oldSolutionAbstract = solutionAbstract;
		solutionAbstract = newSolutionAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SOLUTION__SOLUTION_ABSTRACT, oldSolutionAbstract, solutionAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSolutionType() {
		return solutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolutionType(Integer newSolutionType) {
		Integer oldSolutionType = solutionType;
		solutionType = newSolutionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SOLUTION__SOLUTION_TYPE, oldSolutionType, solutionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_SOLUTION__TITLE:
				return getTitle();
			case PrsPackage.PRS_SOLUTION__SOLUTION_ABSTRACT:
				return getSolutionAbstract();
			case PrsPackage.PRS_SOLUTION__SOLUTION_TYPE:
				return getSolutionType();
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
			case PrsPackage.PRS_SOLUTION__TITLE:
				setTitle((String)newValue);
				return;
			case PrsPackage.PRS_SOLUTION__SOLUTION_ABSTRACT:
				setSolutionAbstract((String)newValue);
				return;
			case PrsPackage.PRS_SOLUTION__SOLUTION_TYPE:
				setSolutionType((Integer)newValue);
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
			case PrsPackage.PRS_SOLUTION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PrsPackage.PRS_SOLUTION__SOLUTION_ABSTRACT:
				setSolutionAbstract(SOLUTION_ABSTRACT_EDEFAULT);
				return;
			case PrsPackage.PRS_SOLUTION__SOLUTION_TYPE:
				setSolutionType(SOLUTION_TYPE_EDEFAULT);
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
			case PrsPackage.PRS_SOLUTION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PrsPackage.PRS_SOLUTION__SOLUTION_ABSTRACT:
				return SOLUTION_ABSTRACT_EDEFAULT == null ? solutionAbstract != null : !SOLUTION_ABSTRACT_EDEFAULT.equals(solutionAbstract);
			case PrsPackage.PRS_SOLUTION__SOLUTION_TYPE:
				return SOLUTION_TYPE_EDEFAULT == null ? solutionType != null : !SOLUTION_TYPE_EDEFAULT.equals(solutionType);
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
		result.append(" (Title: ");
		result.append(title);
		result.append(", SolutionAbstract: ");
		result.append(solutionAbstract);
		result.append(", SolutionType: ");
		result.append(solutionType);
		result.append(')');
		return result.toString();
	}

} //PRS_SolutionImpl
