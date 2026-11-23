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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_AdminDomain;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_StorageTier;
import org.dmtf.cim.CIM_TierService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Tier Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_TierServiceImpl extends CIM_ServiceImpl implements CIM_TierService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TierServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TierService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateStorageTier(String ElementName, EList<CIM_LogicalElement> Members, String TierSettingData, CIM_ManagedElement Goal, EList<CIM_AdminDomain> TierDomain, CIM_ConcreteJob Job, CIM_StorageTier StorageTier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long DeleteStorageTier(String TierSettingData, CIM_ConcreteJob Job, CIM_StorageTier StorageTier, Boolean Force) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddToStorageTier(EList<CIM_LogicalElement> Members, String TierSettingData, CIM_ManagedElement Goal, CIM_ConcreteJob Job, CIM_StorageTier StorageTier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RemoveFromStorageTier(EList<CIM_LogicalElement> Members, String TierSettingData, CIM_ConcreteJob Job, CIM_StorageTier StorageTier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateTierDomain(String ElementName, String TierSettingData, CIM_ConcreteJob Job, CIM_AdminDomain TierDomain) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long DeleteTierDomain(CIM_ConcreteJob Job, Boolean Force, CIM_AdminDomain TierDomain) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ModifyStorageTierDomainAssociation(CIM_AdminDomain RemoveFromTierDomain, CIM_AdminDomain AddToTierDomain, String TierSettingData, CIM_ConcreteJob Job, CIM_StorageTier StorageTier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetStorageTierCandidateObjects(EList<CIM_LogicalElement> InElements, String TierSettingData, CIM_ManagedElement Goal, CIM_ConcreteJob Job, EList<CIM_LogicalElement> Candidates) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_TIER_SERVICE___CREATE_STORAGE_TIER__STRING_ELIST_STRING_CIM_MANAGEDELEMENT_ELIST_CIM_CONCRETEJOB_CIM_STORAGETIER:
				return CreateStorageTier((String)arguments.get(0), (EList<CIM_LogicalElement>)arguments.get(1), (String)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (EList<CIM_AdminDomain>)arguments.get(4), (CIM_ConcreteJob)arguments.get(5), (CIM_StorageTier)arguments.get(6));
			case CimPackage.CIM_TIER_SERVICE___DELETE_STORAGE_TIER__STRING_CIM_CONCRETEJOB_CIM_STORAGETIER_BOOLEAN:
				return DeleteStorageTier((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageTier)arguments.get(2), (Boolean)arguments.get(3));
			case CimPackage.CIM_TIER_SERVICE___ADD_TO_STORAGE_TIER__ELIST_STRING_CIM_MANAGEDELEMENT_CIM_CONCRETEJOB_CIM_STORAGETIER:
				return AddToStorageTier((EList<CIM_LogicalElement>)arguments.get(0), (String)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (CIM_StorageTier)arguments.get(4));
			case CimPackage.CIM_TIER_SERVICE___REMOVE_FROM_STORAGE_TIER__ELIST_STRING_CIM_CONCRETEJOB_CIM_STORAGETIER:
				return RemoveFromStorageTier((EList<CIM_LogicalElement>)arguments.get(0), (String)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (CIM_StorageTier)arguments.get(3));
			case CimPackage.CIM_TIER_SERVICE___CREATE_TIER_DOMAIN__STRING_STRING_CIM_CONCRETEJOB_CIM_ADMINDOMAIN:
				return CreateTierDomain((String)arguments.get(0), (String)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (CIM_AdminDomain)arguments.get(3));
			case CimPackage.CIM_TIER_SERVICE___DELETE_TIER_DOMAIN__CIM_CONCRETEJOB_BOOLEAN_CIM_ADMINDOMAIN:
				return DeleteTierDomain((CIM_ConcreteJob)arguments.get(0), (Boolean)arguments.get(1), (CIM_AdminDomain)arguments.get(2));
			case CimPackage.CIM_TIER_SERVICE___MODIFY_STORAGE_TIER_DOMAIN_ASSOCIATION__CIM_ADMINDOMAIN_CIM_ADMINDOMAIN_STRING_CIM_CONCRETEJOB_CIM_STORAGETIER:
				return ModifyStorageTierDomainAssociation((CIM_AdminDomain)arguments.get(0), (CIM_AdminDomain)arguments.get(1), (String)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (CIM_StorageTier)arguments.get(4));
			case CimPackage.CIM_TIER_SERVICE___GET_STORAGE_TIER_CANDIDATE_OBJECTS__ELIST_STRING_CIM_MANAGEDELEMENT_CIM_CONCRETEJOB_ELIST:
				return GetStorageTierCandidateObjects((EList<CIM_LogicalElement>)arguments.get(0), (String)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (EList<CIM_LogicalElement>)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_TierServiceImpl
