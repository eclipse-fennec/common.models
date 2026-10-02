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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.MarkupTableCell;
import gov.nist.csrc.ns.oscal.MarkupTableRow;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupTableRowImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupTableRowImpl#getTd <em>Td</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupTableRowImpl#getTh <em>Th</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkupTableRowImpl extends MinimalEObjectImpl.Container implements MarkupTableRow {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupTableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMarkupTableRow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OSCALPackage.MARKUP_TABLE_ROW__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupTableCell> getTd() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupTableRow_Td());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupTableCell> getTh() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupTableRow_Th());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MARKUP_TABLE_ROW__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_TABLE_ROW__TD:
				return ((InternalEList<?>)getTd()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_TABLE_ROW__TH:
				return ((InternalEList<?>)getTh()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.MARKUP_TABLE_ROW__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OSCALPackage.MARKUP_TABLE_ROW__TD:
				return getTd();
			case OSCALPackage.MARKUP_TABLE_ROW__TH:
				return getTh();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.MARKUP_TABLE_ROW__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OSCALPackage.MARKUP_TABLE_ROW__TD:
				getTd().clear();
				getTd().addAll((Collection<? extends MarkupTableCell>)newValue);
				return;
			case OSCALPackage.MARKUP_TABLE_ROW__TH:
				getTh().clear();
				getTh().addAll((Collection<? extends MarkupTableCell>)newValue);
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
			case OSCALPackage.MARKUP_TABLE_ROW__GROUP:
				getGroup().clear();
				return;
			case OSCALPackage.MARKUP_TABLE_ROW__TD:
				getTd().clear();
				return;
			case OSCALPackage.MARKUP_TABLE_ROW__TH:
				getTh().clear();
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
			case OSCALPackage.MARKUP_TABLE_ROW__GROUP:
				return group != null && !group.isEmpty();
			case OSCALPackage.MARKUP_TABLE_ROW__TD:
				return !getTd().isEmpty();
			case OSCALPackage.MARKUP_TABLE_ROW__TH:
				return !getTh().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //MarkupTableRowImpl
