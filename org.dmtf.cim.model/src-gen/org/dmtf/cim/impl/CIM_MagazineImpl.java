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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_Magazine;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Magazine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MagazineImpl#getPhysicalLabels <em>Physical Labels</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MagazineImpl#getLabelStates <em>Label States</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MagazineImpl#getLabelFormats <em>Label Formats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MagazineImpl extends CIM_StorageMediaLocationImpl implements CIM_Magazine {
	/**
	 * The cached value of the '{@link #getPhysicalLabels() <em>Physical Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> physicalLabels;

	/**
	 * The cached value of the '{@link #getLabelStates() <em>Label States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> labelStates;

	/**
	 * The cached value of the '{@link #getLabelFormats() <em>Label Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> labelFormats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MagazineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Magazine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPhysicalLabels() {
		if (physicalLabels == null) {
			physicalLabels = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_MAGAZINE__PHYSICAL_LABELS);
		}
		return physicalLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLabelStates() {
		if (labelStates == null) {
			labelStates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MAGAZINE__LABEL_STATES);
		}
		return labelStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLabelFormats() {
		if (labelFormats == null) {
			labelFormats = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MAGAZINE__LABEL_FORMATS);
		}
		return labelFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MAGAZINE__PHYSICAL_LABELS:
				return getPhysicalLabels();
			case CimPackage.CIM_MAGAZINE__LABEL_STATES:
				return getLabelStates();
			case CimPackage.CIM_MAGAZINE__LABEL_FORMATS:
				return getLabelFormats();
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
			case CimPackage.CIM_MAGAZINE__PHYSICAL_LABELS:
				getPhysicalLabels().clear();
				getPhysicalLabels().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_MAGAZINE__LABEL_STATES:
				getLabelStates().clear();
				getLabelStates().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MAGAZINE__LABEL_FORMATS:
				getLabelFormats().clear();
				getLabelFormats().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_MAGAZINE__PHYSICAL_LABELS:
				getPhysicalLabels().clear();
				return;
			case CimPackage.CIM_MAGAZINE__LABEL_STATES:
				getLabelStates().clear();
				return;
			case CimPackage.CIM_MAGAZINE__LABEL_FORMATS:
				getLabelFormats().clear();
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
			case CimPackage.CIM_MAGAZINE__PHYSICAL_LABELS:
				return physicalLabels != null && !physicalLabels.isEmpty();
			case CimPackage.CIM_MAGAZINE__LABEL_STATES:
				return labelStates != null && !labelStates.isEmpty();
			case CimPackage.CIM_MAGAZINE__LABEL_FORMATS:
				return labelFormats != null && !labelFormats.isEmpty();
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
		result.append(" (PhysicalLabels: ");
		result.append(physicalLabels);
		result.append(", LabelStates: ");
		result.append(labelStates);
		result.append(", LabelFormats: ");
		result.append(labelFormats);
		result.append(')');
		return result.toString();
	}

} //CIM_MagazineImpl
